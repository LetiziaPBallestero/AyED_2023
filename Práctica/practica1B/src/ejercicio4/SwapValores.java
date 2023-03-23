package ejercicio4;

/*
a. Intente averiguarlo sin ejecutar el programa en su computadora.
b. Ejecute el ejercicio en su computadora, y compare su resultado con lo esperado en el inciso anterior.
 */
// a : "a=" + 1 + " b=" + 2 ; "c=" + 4 + " d=" + 3
// b : "a=" + 1 + " b=" + 2 ; "c=" + 3 + " d=" + 4
// c : 

public class SwapValores {

	public static void swap1(int x, int y) {
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
	}

	public static void swap2(Integer x, Integer y) {
		if (x < y) { // 3 < 4 
			int tmp = x; // tmp = 3 
			x = y; // x = 4 
			y = tmp; // y = 3
		}
	}

	public static void main(String[] args) {
		int a = 1, b = 2;
		Integer c = 3, d = 4;
		swap1(a, b);
		swap2(c, d);
		System.out.println("a=" + a + " b=" + b);
		System.out.println("c=" + c + " d=" + d);
	}
}
