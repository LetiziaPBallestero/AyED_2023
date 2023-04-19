package tp04.ejercicio1;

import colaPila.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}

	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}

	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo))
				hijos.eliminar(hijo);
		}
	}

	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}

	/**
	 * public int altura(): int devuelve la altura del árbol, es decir, la longitud
	 * del camino más largo desde el nodo raíz hasta una hoja.
	 * 
	 * @return
	 */

	public Integer altura() {
		Integer alt = -1;
		if (!this.esVacio()) {
			if (this.esHoja())
				return 0;
			else {
				ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
				lHijos.comenzar();
				while (!lHijos.fin())
					alt = Math.max(alt, lHijos.proximo().altura());
			}
		}
		return alt + 1;
	}

	/*
	 * public int nivel(T dato) devuelve la profundidad o nivel del dato en el
	 * árbol. El nivel de un nodo es la longitud del único camino de la raíz al
	 * nodo.
	 */

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> aux;

		cola.encolar(this);
		cola.encolar(null);

		int nivel = 0;

		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) {
				if (aux.getDato() == dato)
					return nivel;
			}
			if (aux != null) {
				ListaGenerica<ArbolGeneral<T>> lHijos = aux.getHijos();
				lHijos.comenzar();
				while (!lHijos.fin()) {
					cola.encolar(lHijos.proximo());
				}
			}

			else if (!cola.esVacia()) {
				cola.encolar(null);
				nivel++;
			}
		}
		return -1;
	}

	/*
	 * c) public int ancho(): int la amplitud (ancho) de un árbol se define como la
	 * cantidad de nodos que se encuentran en el nivel que posee la mayor cantidad
	 * de nodos.
	 */
	public Integer ancho() {
		
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> aux;
		
		cola.encolar(this);
		cola.encolar(null);
		
		int cantidad=0;
		int max = -1;
		
		// arranca 
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) {
				// nivel nuevo
				cantidad++;
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> lhijos = aux.getHijos();
					lhijos.comenzar();
					while (!lhijos.fin())
						cola.encolar(lhijos.proximo());
				}
			}
			else {
				// al final del nivel comparo
				if(cantidad > max)
					max = cantidad;
				cantidad=0;		
				if (!cola.esVacia()) {			
					cola.encolar(null);
				}
			}
		}
		return max;
	}

}