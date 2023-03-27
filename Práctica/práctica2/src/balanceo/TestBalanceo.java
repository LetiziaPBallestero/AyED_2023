package balanceo;

import colaPila.PilaGenerica;

public class TestBalanceo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBalanceo  balanceado = new TestBalanceo ();

		
		System.out.println(balanceado.estaBalanceado("{()[()]}")); // true 
		System.out.println(balanceado.estaBalanceado("([)]")); // fals
		System.out.println(balanceado.estaBalanceado("")); // true
	}
	
	public boolean esApertura(char caracter) {
		return (caracter == '(') 
				|| (caracter == '{') 
				|| (caracter == '[');
	}

	public boolean sonIguales(char apertura, char cierre) {
		return (apertura == '(' && cierre == ')')
				|| (apertura == '{' && cierre == '}') 
				|| (apertura == '[' && cierre == ']');
	}

	public boolean estaBalanceado(String string) {
		PilaGenerica<Character> pila = new PilaGenerica<>();
	        	
		for (int i=0 ; i < string.length(); i++) {
				char caracter = string.charAt(i);
				if (esApertura(caracter)) {
					pila.apilar(caracter);
	        	} else {
	        		char enPila = pila.desapilar();
	        		if (!sonIguales(enPila , caracter)) {
	        			return false;
	        		}
	        	}
	        }
		return pila.esVacia();
	}
}
