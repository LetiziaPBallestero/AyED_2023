package tp03.ejercicio1;

import colaPila.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;

	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}

	// ejercicio 2
	// Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.
	public int contarHojas() {
		int suma = 0;

		if (this.esVacio()) {
			return 0;
		}

		if (this.tieneHijoIzquierdo()) {
			suma += this.hijoIzquierdo.contarHojas();

		}
		if (this.tieneHijoDerecho()) {
			suma += this.hijoDerecho.contarHojas();

		}
		if (this.esHoja()) {
			return 1;
		}

		return suma;
	}

	// ejercicio 3
	public ArbolBinario<T> espejo() {
		ArbolBinario<T> arbol = new ArbolBinario<T>();

		if (this.esVacio())
			return null;

		if (this.tieneHijoIzquierdo())
			arbol.agregarHijoDerecho(this.getHijoIzquierdo().espejo());

		if (this.tieneHijoDerecho())
			arbol.agregarHijoIzquierdo(this.getHijoDerecho().espejo());

		arbol.setDato(this.getDato());

		return arbol;

	}

	public void entreNiveles(int n, int m) {
		int nivel = 0;
		ArbolBinario<T> arbol = new ArbolBinario<T>();
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);

		while ((!cola.esVacia()) && (nivel <= m)) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (nivel >= n)
					System.out.print(arbol.getDato() + " ");
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			} else if (!cola.esVacia()) {
				cola.encolar(null);
				System.out.println();
				nivel++;
			}
		}
	}

	public void recorridoPorNivel() {
		ArbolBinario<T> arbol = new ArbolBinario<T>();
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);

		while (!cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol != null) {
				System.out.print(arbol.getDato() + " ");
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			} else if (!cola.esVacia()) {
				cola.encolar(null);
				System.out.println();
			}
		}
	}

}
