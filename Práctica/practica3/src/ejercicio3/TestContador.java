package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class TestContador {

	public static void main(String[] args) {
		ArbolBinario<Integer> A = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> B = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> C = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> D = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> E = new ArbolBinario<Integer>(5);

		ListaEnlazadaGenerica<ListaEnlazadaGenerica<Integer>> lista = new ListaEnlazadaGenerica<ListaEnlazadaGenerica<Integer>>();
		ListaEnlazadaGenerica<Integer> lAux = new ListaEnlazadaGenerica<Integer>();

		A.agregarHijoIzquierdo(B);
		A.agregarHijoDerecho(C);
		
		B.agregarHijoIzquierdo(D);
		B.agregarHijoDerecho(E);

		ContadorArbol contador = new ContadorArbol(A);

		lista = contador.numerosPares();
		System.out.println(" La primera es en inOrden y la segunda en preOrden ");
		// imprimir lista de listas
		lista.comenzar();
		while (!lista.fin()) {
			lAux = lista.proximo();
			System.out.println(" ");
			while (!lAux.fin())
				System.out.print(lAux.proximo() + " ");
				
		}
	}

}
