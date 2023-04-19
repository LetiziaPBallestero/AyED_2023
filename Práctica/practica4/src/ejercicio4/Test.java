package ejercicio4;

import tp04.ejercicio1.ArbolGeneral;

public class Test {
	public static void main(String[] args) {

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

		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);

		b.agregarHijo(e);
		b.agregarHijo(f);

		c.agregarHijo(g);
		c.agregarHijo(h);

		d.agregarHijo(i);

		i.agregarHijo(j);

		System.out.println("La altura es de " + a.altura());
		// Altura tiene que ser igual a 3
		System.out.println(10 + " está en el nivel " + a.nivel(10));
		// tiene que dar 3
		System.out.println("El ancho es de " + a.ancho());
		// tiene que dar 3

	}
}


