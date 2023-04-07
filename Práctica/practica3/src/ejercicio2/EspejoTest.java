package ejercicio2;

import tp03.ejercicio1.ArbolBinario;

public class EspejoTest {

	public static void main(String[] args) {

		ArbolBinario<Integer> A = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> B = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> C = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> D = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> E = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> F = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> Invertido = new ArbolBinario<Integer>();

		A.agregarHijoIzquierdo(B);
		A.agregarHijoDerecho(C);

		B.agregarHijoIzquierdo(D);
		B.agregarHijoDerecho(E);

		C.agregarHijoIzquierdo(F);
		
		
		
		System.out.println ("Árbol normal:" );
		imprimir(A);
		System.out.println ("//////////////////");
		Invertido = A.espejo();
		System.out.println ("Árbol invertido: ");
		imprimir (Invertido);
	}
	
	public static <T> void imprimir (ArbolBinario<T> a) {
		
		System.out.println ("Nodo " + a.getDato()); 
		if (a.tieneHijoIzquierdo()) {
			System.out.println ("Hijo izquierdo: ");
			imprimir (a.getHijoIzquierdo());
		}
		if (a.tieneHijoDerecho()) {
			System.out.println ("Hijo Derecho: ");
			imprimir (a.getHijoDerecho());
		}
		
	}

}
