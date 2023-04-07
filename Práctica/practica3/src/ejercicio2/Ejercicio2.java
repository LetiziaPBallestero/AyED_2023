package ejercicio2;

import tp03.ejercicio1.ArbolBinario;

public class Ejercicio2 {
	public static void main(String[] args) {

		ArbolBinario<Integer> A = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> B = new ArbolBinario<Integer>(13);
		ArbolBinario<Integer> C = new ArbolBinario<Integer>(14);
		ArbolBinario<Integer> D = new ArbolBinario<Integer>(15);
		ArbolBinario<Integer> E = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> F = new ArbolBinario<Integer>(17);
		ArbolBinario<Integer> G = new ArbolBinario<Integer>(18);

		A.agregarHijoIzquierdo(B);
		A.agregarHijoDerecho(C);

		B.agregarHijoIzquierdo(D);
		B.agregarHijoDerecho(E);

		C.agregarHijoIzquierdo(F);
		C.agregarHijoDerecho(G);

		System.out.println("Este árbol tiene " + A.contarHojas() + " hojas");

	}
}
