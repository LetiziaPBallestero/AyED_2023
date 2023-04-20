package ejercicio7;

import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable {
	
private ArbolGeneral<Integer> arbol;
	
	public RedDeAguaPotable(ArbolGeneral<Integer> a) {
		this.arbol = a;
	}
	
	public double minimoCaudal(double caudal) { 
		// dato de entrada, me lo tengo que guardar 
		// tengo que saber la cantidad de nodos 
		double entrada;
		
		if (arbol.esVacio()) { 
			return 0;
		} else { 
			entrada = arbol.getDato();
		}
		
		
		
	}
	
	
	

}
