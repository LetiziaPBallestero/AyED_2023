package colaPila;


import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T> {

	private ListaGenerica<T> dato = new ListaEnlazadaGenerica<T>();

	public void apilar(T dato) {
		this.dato.agregarInicio(dato);
	}

	public T desapilar() {
		T elemento = this.dato.elemento(this.dato.tamanio());
		this.dato.eliminarEn(this.dato.tamanio());
		return elemento;
	}

	public T tope() {
		return this.dato.elemento(this.dato.tamanio());
	}

	public boolean esVacia() {
		return this.dato.esVacia();
	}

}