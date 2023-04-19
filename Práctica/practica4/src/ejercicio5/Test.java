package ejercicio5;

import tp04.ejercicio1.ArbolGeneral;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaEmpresa dato = new AreaEmpresa (14,"M");
		ArbolGeneral<AreaEmpresa> m = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa (13,"J");
		ArbolGeneral<AreaEmpresa> j = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (25,"K");
		ArbolGeneral<AreaEmpresa> k = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (10,"L");
		ArbolGeneral<AreaEmpresa> l = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa (4,"A");
		ArbolGeneral<AreaEmpresa> a = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (7,"B");
		ArbolGeneral<AreaEmpresa> b = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (5,"C");
		ArbolGeneral<AreaEmpresa> c = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa (6,"D");
		ArbolGeneral<AreaEmpresa> d = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (10,"E");
		ArbolGeneral<AreaEmpresa> e = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (18,"F");
		ArbolGeneral<AreaEmpresa> f = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa (9,"G");
		ArbolGeneral<AreaEmpresa> g = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (12,"H");
		ArbolGeneral<AreaEmpresa> h = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa (19,"I");
		ArbolGeneral<AreaEmpresa> i = new ArbolGeneral<AreaEmpresa>(dato);
		
		m.agregarHijo(j);
		m.agregarHijo(k);
		m.agregarHijo(l);
		
		j.agregarHijo(a);
		j.agregarHijo(b);
		j.agregarHijo(c);
		
		k.agregarHijo(d);
		k.agregarHijo(e);
		k.agregarHijo(f);
		
		l.agregarHijo(g);
		l.agregarHijo(h);
		l.agregarHijo(i);
		
		AnalizadorArbol test = new AnalizadorArbol();
		
		System.out.println("El maximo promedio es " + test.devolverMaximoPromedio(m));
	}

}
