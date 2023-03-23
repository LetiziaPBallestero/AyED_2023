package ejercicio5;

public class Ejercicio5 {
	private static int max;
	private static int min;
	private static double promedio;

	public static void main(String[] args) {
		int[] numeros = { 23 , 45 , 6 ,4 ,34 , -32 , 23 ,345,345, 1000 };
		System.out.println(funcionV1(numeros));

		Datos datos = new Datos();
		funcionV2(numeros, datos);
		System.out.println(datos);

		funcionV3(numeros);
	}

	/*
	 * a. Devuelva lo pedido por el mecanismo de retorno de un método en Java
	 * ("return").
	 */

	public static Datos funcionV1(int[] numeros) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double promedio = 0;

		for (int n : numeros) {
			promedio += n;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}

		return new Datos(max, min, promedio / numeros.length);
	}

	/*
	 * b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no
	 * puede ser de tipo arreglo).
	 */
	public static void funcionV2(int[] numeros, Datos datos) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double promedio = 0;

		for (int n : numeros) {
			promedio += n;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}

		datos.setMax(max);
		datos.setMin(min);
		datos.setPromedio(promedio / numeros.length);
		System.out.println(datos.toString());
	}

	/*
	 * c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".
	 * Es decir, usando variables de clase globales
	 */
	public static void funcionV3(int[] numeros) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double promedio = 0;

		for (int n : numeros) {
			promedio += n;
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}
		Ejercicio5.min = min;
		Ejercicio5.max = max;
		Ejercicio5.promedio = promedio / numeros.length;
	}
}
