package colaPila;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ColaGenerica<T> {
	
	private ListaGenerica<T> dato = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T dato) {
		this.dato.agregarFinal(dato);
	}
	
	public T desencolar () {
		T elemento = this.dato.elemento(1);
		this.dato.eliminarEn(1);
		return elemento;
	}
	
	public T tope () {
		return this.dato.elemento(1);
	}
	
	public boolean esVacia() {
		return this.dato.fin();
	}

}