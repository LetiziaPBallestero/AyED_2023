package ejercicio3;

import colaPila.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAG {

	/**
	 * Método que retorna una lista con los elementos impares del árbol “a” que sean
	 * mayores al valor “n” pasados como parámetros, recorrido en preorden.
	 * 
	 */

	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		if (!a.esVacio()) {
			preOrden(a, n, lis);
		}
		return lis;
	}

	private void preOrden(ArbolGeneral<Integer> a, Integer n, ListaEnlazadaGenerica<Integer> l) {
		// r - hi - hd
		// primero analizo si cumple con la condición, después recorro los hijos

		if ((a.getDato() % 2 != 0) & (a.getDato() > n)) {
			l.agregarFinal(a.getDato());
		}
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
			lHijos.comenzar();
			while (!lHijos.fin()) {
				preOrden(lHijos.proximo(), n, l);
			}
		}

	}

	/*
	 * Método que retorna una lista con los elementos impares del árbol “a” que sean
	 * mayores al valor “n” pasados como parámetros, recorrido en inorden.
	 */
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		if (!a.esVacio()) {
			inOrden(a, n, lis);
		}
		return lis;

	}

	private void inOrden(ArbolGeneral<Integer> a, Integer n, ListaEnlazadaGenerica<Integer> l) {
		// hi - r - hd
		// recorro UN hijo, analizo la condición , devuelvo

		ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
		lHijos.comenzar();

		if (!lHijos.esVacia())
			inOrden(lHijos.proximo(), n, l);
		// recorro

		if ((a.getDato() % 2 != 0) && (a.getDato() > n))
			l.agregarFinal(a.getDato());

		while (!lHijos.fin() && !lHijos.esVacia())
			inOrden(lHijos.proximo(), n, l);

	}

	/*
	 * Método que retorna una lista con los elementos impares del árbol “a” que sean
	 * mayores al valor “n” pasados como parámetros recorrido en postorden.
	 * 
	 */
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n) {
		ListaEnlazadaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		if (!a.esVacio()) {
			postOrden(a, n, lis);
		}
		return lis;
	}

	private void postOrden(ArbolGeneral<Integer> a, Integer n, ListaEnlazadaGenerica<Integer> l) {
		// hi - hd - r
		// recorro AMBOS hijos, después analizo

		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();

			lHijos.comenzar();
			while (!lHijos.fin())
				postOrden(lHijos.proximo(), n, l);
		}
		// recorro

		if ((a.getDato() % 2 != 0) && (a.getDato() > n))
			l.agregarFinal(a.getDato());
	}

	/*
	 * blablablabla por niveles
	 */
	public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n) {
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();

		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> arbolAux;
		cola.encolar(a);
		while (!cola.esVacia()) {
			arbolAux = cola.desencolar();
			if (( arbolAux.getDato() % 2 != 0) & (arbolAux.getDato() > n))
				l.agregarFinal(arbolAux.getDato());
			if (arbolAux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = arbolAux.getHijos();
				hijos.comenzar();
				while (!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			}
		}

		return l;
	}

}
