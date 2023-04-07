package ejercicio2;

import tp03.ejercicio1.ArbolBinario;

public class EntreNivelesTest {

	public static void main(String[] args) {
		ArbolBinario<Integer> A = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> B = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> C = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> D = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> E = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> F = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> G = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> H = new ArbolBinario<Integer>(8);
		ArbolBinario<Integer> I = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> J = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> K = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> L = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> M = new ArbolBinario<Integer>(13);
		ArbolBinario<Integer> N = new ArbolBinario<Integer>(14);
		ArbolBinario<Integer> O = new ArbolBinario<Integer>(15);


		A.agregarHijoIzquierdo(B);
		A.agregarHijoDerecho(C);

		B.agregarHijoIzquierdo(D);
		B.agregarHijoDerecho(E);

		C.agregarHijoIzquierdo(F);
		C.agregarHijoDerecho(G);
		
		D.agregarHijoIzquierdo(H);
		D.agregarHijoDerecho(I);
		
		E.agregarHijoIzquierdo(J);
		E.agregarHijoDerecho(K);
		
		F.agregarHijoIzquierdo(L);
		F.agregarHijoDerecho(M);
		
		G.agregarHijoIzquierdo(N);
		G.agregarHijoDerecho(O);

		System.out.println("Entre los niveles 2 y 3");
		A.entreNiveles(2, 3);


	}

}
