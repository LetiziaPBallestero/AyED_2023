package ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {

	private ArbolBinario<Integer> arbol;

	public RedBinariaLlena(ArbolBinario<Integer> a) {
		this.arbol = a;
	}

	// retardoReenvio():int
	public int retardoReenvio() {
		if (this.arbol.esVacio())
			return -1;

		return retardoReenvio(this.arbol);
	}

	private int retardoReenvio(ArbolBinario<Integer> a) {
		int retardo = 0;

		if (a.tieneHijoIzquierdo()) {
			retardo = Math.max(retardo, retardoReenvio(a.getHijoIzquierdo()));
		}
		
		if (a.tieneHijoDerecho()) {
			retardo = Math.max(retardo, retardoReenvio(a.getHijoDerecho()));
		}
		if (a.esHoja()) { 
			return a.getDato();
		}
		return retardo + a.getDato();
	}

}
