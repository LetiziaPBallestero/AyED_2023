package ejercicio5;

import colaPila.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {

	private ArbolBinario<Integer> arbol;

	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.arbol = a;
	}

	public int sumaElementosProfundidad(int p) {
		int nivel = 0;
		int suma = 0;

		ArbolBinario<Integer> aux;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();

		cola.encolar(this.arbol);
		cola.encolar(null);

		if (arbol.esVacio())
			return -1;

		while ((!cola.esVacia()) && !(nivel > p)) {

			aux = cola.desencolar();
			System.out.println("Estoy en el nivel " + nivel);

			if (aux != null) {
				System.out.println("Nodo: " + aux.getDato());

				if (nivel == p) {
					suma += aux.getDato();
				}

				if (aux.tieneHijoIzquierdo()) {
					System.out.println("Encolo al hijo izquierdo " + aux.getHijoIzquierdo().getDato());
					cola.encolar(aux.getHijoIzquierdo());
				}
				if (aux.tieneHijoDerecho()) {
					System.out.println("Encolo al hijo DERECHO " + aux.getHijoDerecho().getDato());
					cola.encolar(aux.getHijoDerecho());
				}
			} else {
				// si es null
				if (!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
				}
			}
		}

		return suma;

	}

}
