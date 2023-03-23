package ejercicio1;

/**impriman todos los números 
 * enteros comprendidos entre a; b (inclusive),
 *  uno por cada línea en la salida estándar. 
 *  Para ello, dentro de una nueva clase escriba un 
 *  método por cada uno de los siguientes incisos: **/


public class Ejercicio_1 {
	//Que realice lo pedido con un for.
	public static void incisoA (int a , int b) { 
		int i;
		for (i=a ; i <= b ; i++)  
			System.out.print(i + " - ");
	}
	// con un while 
	public static void incisoB (int a , int b) { 
		
		int i=a;
		while (i <= b ) { 
			System.out.print (i + " - ");
			i++;
		}
	}
	// sin estructuras -> recursivo
	public static void incisoC (int a , int b) {
		if (a <= b) { 
			System.out.print(a + " - ");
			incisoC(a+1 , b);
		}
	}
	
	public static void main (String[] args) { 
		int a = 3; 
		int b = 10; 
		
		System.out.println ("Con un For:");
		incisoA(a,b);
		System.out.println("");
		System.out.println ("Con un While:");
		incisoB(a,b);
		System.out.println("");
		System.out.println ("Sin estructuras iterativas:");
		incisoC(a,b);
		
	}
}	