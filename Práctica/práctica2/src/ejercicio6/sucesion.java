package ejercicio6;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class sucesion {

	ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();

	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		l.agregarFinal(n);
		if (n != 1) {// la sucesion termina en 1
			if (n % 2 == 0) // si n es par
				n = n / 2;
			else
				n = 3 * n + 1;

			calcularSucesion(n);
		}
		return l;
	}

}
