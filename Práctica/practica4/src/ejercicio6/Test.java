package ejercicio6;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;


public class Test {

	public static void main(String[] args) {
		ListaGenerica<ArbolGeneral<Integer>> lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> j = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> k = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> l = new ArbolGeneral<Integer>(12);
		
		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);
		
		b.agregarHijo(e);
		b.agregarHijo(f);
		
		c.agregarHijo(g);
		
		d.agregarHijo(h);
		
		h.agregarHijo(i);
		h.agregarHijo(j);
		h.agregarHijo(k);
		
		k.agregarHijo(l);
		
		System.out.println("ES ANCESTRO: " + a.esAncestro(8,12));
		// true 
		System.out.println("ES ANCESTRO: " + a.esAncestro2(8,6));
		// false
		
	}

}