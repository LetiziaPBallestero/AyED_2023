package ejercicio2_1;

import java.util.Scanner;
import tp02.ejercicio1.*;

/* 
 * Escriba una clase llamada TestListaDeEnterosConArreglos 
 * que reciba en su método main una secuencia de números, 
 * los agregue a un objeto de tipo ListaDeEnterosConArreglos 
 * y luego imprima los elementos de dicha lista
 */
public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear una lista
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		llenarLista(lista);
		// imprimir lista
		imprimirLista(lista);

	}

	public static void llenarLista(ListaDeEnterosConArreglos l) {
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

	public static void imprimirLista(ListaDeEnterosConArreglos l) {
		l.comenzar();
		while (!l.fin()) {
			System.out.print((l.proximo()) + "  ");
		}
	}

}
