package ejercicio2;

import java.util.Scanner;

public class Ejercicio_2 {
	/*
	 * Escriba un método de clase que dado un número n devuelva un nuevo arreglo de
	 * tamaño n con los n primeros múltiplos enteros de n mayores o iguales que 1.
	 * Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k}
	 */

	/*
	 * Scanner s = new Scanner(System.in) ; int cantidad = 1 ; while (s.nextInt() !=
	 * 42) { cantidad++;
	 */

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Cantidad de numeros a leer: ");
		int n = S.nextInt();
		System.out.println("");

		System.out.println("Multiplos de " + n);
		 multiplosN(n);
		S.close();
	}

	public static int[] multiplosN(int n) {
		int[] multiplos = new int[n];
		for (int i = 1; i <= n; i++) {
			System.out.print(n*i + " - ");
			/*
			 * tiene que ponerse i=1 e i<=n ya que si se pone 0, se va a poner el primer
			 * elemento en -1 y va a salir error y es i-1 para la pos anterior y n*i para
			 * generar el multiplo
			 */

			multiplos[i - 1] = n * i;
		}
		return multiplos;
	}

}
