package ejercicio5_1;

import java.util.Scanner;

/* 
 * Escriba un método recursivo que imprima los elementos de una lista en sentido inverso. 
 * La lista la recibe por parámetro
 */
import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class ListaInvertida {

	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();

		llenarLista(l);
		l.comenzar();
		imprimir(l);
		
	}
	
	public static void llenarLista(ListaDeEnterosEnlazada l) {
		int i = 0;
		Scanner S = new Scanner(System.in);
		System.out.println("-1 corta");
		while (i != -1) {
			System.out.print("Ingrese un numero: ");
			i = S.nextInt();
			l.agregarFinal(i);
		}
		S.close();
	}
	
	public static void imprimir (ListaDeEnterosEnlazada l) {
		if (!l.fin()) {
			int nodo = l.proximo();
			imprimir (l);
			System.out.print(nodo + " ");
		}
	}

}
