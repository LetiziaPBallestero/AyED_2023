package ejercicio3_1;

import java.util.Scanner;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear una lista
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		llenarLista(lista);
		// imprimir lista
		imprimirLista(lista);

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

	public static void imprimirLista(ListaDeEnterosEnlazada l) {
		l.comenzar();
		while (!l.fin()) {
			System.out.print((l.proximo()) + "  ");
		}
	}

}