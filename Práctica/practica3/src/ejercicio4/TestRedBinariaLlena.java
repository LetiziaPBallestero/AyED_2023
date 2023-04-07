package ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class TestRedBinariaLlena {

	public static void main(String[] args) {
		ArbolBinario<Integer> A = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> B = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> C = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> D = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> E = new ArbolBinario<Integer>(80);
		ArbolBinario<Integer> F = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> G = new ArbolBinario<Integer>(7);

		A.agregarHijoIzquierdo(B);
		A.agregarHijoDerecho(C);

		B.agregarHijoIzquierdo(D);
		B.agregarHijoDerecho(E);

		C.agregarHijoIzquierdo(F);
		C.agregarHijoDerecho(G);

		RedBinariaLlena red = new RedBinariaLlena(A);

		System.out.println("El mayor retardo es " + red.retardoReenvio());

	}

}
