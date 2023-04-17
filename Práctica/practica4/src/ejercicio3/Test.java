package ejercicio3;

import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaGenerica<Integer> lista;

		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(14);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(15);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer>(21);

		a.agregarHijo(b);
		a.agregarHijo(c);
		
		b.agregarHijo(d);
		b.agregarHijo(e);
		
		c.agregarHijo(f);
		c.agregarHijo(g);
		c.agregarHijo(h);
		
		d.agregarHijo(i);

		RecorridosAG test = new RecorridosAG();

		lista = test.numerosImparesMayoresQuePreOrden(a,3);
		System.out.println("preOrden: " + lista);
		// 11 , 21 , 15 , 13 , 5
		lista = test.numerosImparesMayoresQueInOrden(a,3);
		System.out.println("inOrden: " + lista);
		// 21 , 15 , 11 , 13 , 5
		lista = test.numerosImparesMayoresQuePostOrden(a,3);
		System.out.println("postOrden: " + lista);
		// 21 , 15 , 5 , 13 , 11 
		lista = test.numerosImparesMayoresQuePorNiveles(a,3);
		System.out.println("por nivel: " + lista); 
		// 11 , 13 , 15 , 5 , 21

	}
}