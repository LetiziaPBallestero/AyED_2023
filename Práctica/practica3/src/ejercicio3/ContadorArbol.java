package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {

	private ArbolBinario<Integer> arbol;

	public ContadorArbol(ArbolBinario<Integer> a) {
		this.arbol = a;
	}

	public ListaEnlazadaGenerica<ListaEnlazadaGenerica<Integer>> numerosPares() {
		// devuelve todos los elementos pares
		ListaEnlazadaGenerica<ListaEnlazadaGenerica<Integer>> l = new ListaEnlazadaGenerica<ListaEnlazadaGenerica<Integer>>();
		
		ListaEnlazadaGenerica<Integer> l1 = new ListaEnlazadaGenerica<Integer>();
		ListaEnlazadaGenerica<Integer> l2 = new ListaEnlazadaGenerica<Integer>();
		
		contarParesInOrden(l1,this.arbol);
		contarParesPreOrden(l2, this.arbol);

		l.agregarFinal(l1);
		l.agregarFinal(l2);
		return l;
	}

	public void contarParesInOrden(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> arbol) {
		if (arbol.tieneHijoIzquierdo())
			contarParesInOrden(l, arbol.getHijoIzquierdo());
		if (arbol.getDato() % 2 == 0)
			l.agregarFinal(arbol.getDato());
		if (arbol.tieneHijoDerecho())
			contarParesInOrden(l, arbol.getHijoDerecho());

	}

	public void contarParesPreOrden(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> arbol) {
		if (arbol.getDato() % 2 == 0)
			l.agregarFinal(arbol.getDato());
		if (arbol.tieneHijoIzquierdo())
			contarParesPreOrden(l, arbol.getHijoIzquierdo());
		if (arbol.tieneHijoDerecho())
			contarParesPreOrden(l, arbol.getHijoDerecho());

	}

}
