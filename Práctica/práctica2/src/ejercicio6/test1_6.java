package ejercicio6;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class test1_6 {
	
	public static void main (String[] args) {
		
		sucesion cs = new sucesion();
		ListaDeEnterosEnlazada l = cs.calcularSucesion(6);
		l.comenzar();
		while (!l.fin()) {
			System.out.print(l.proximo() + "  ");
		}
	}
		
}
