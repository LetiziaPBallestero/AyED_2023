package ejercicio7;

import colaPila.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable {
	
private ArbolGeneral<String> arbol;
	
	public RedDeAguaPotable(ArbolGeneral<String> a) {
		this.arbol = a;
	}
	
	public double minimoCaudal(double caudal) { 
		// dato de entrada, me lo tengo que guardar 
		// tengo que saber la cantidad de nodos 
		
		ColaGenerica<ArbolGeneral<String>> cola = new ColaGenerica<ArbolGeneral<String>>();
		ColaGenerica<Double> colaCaudal = new ColaGenerica<Double>(); 
		ArbolGeneral<String> aux;
		double caudalAuxiliar;
		double cantidadHijos = 0;
		double caudalMinimo=9999;
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		colaCaudal.encolar(caudal);
		colaCaudal.encolar(null);
		
		while (!cola.esVacia()) {
			aux = cola.desencolar();
			caudalAuxiliar = colaCaudal.desencolar();
			
			if (aux != null) {
				if (caudalAuxiliar < caudalMinimo) 
					caudalMinimo = caudalAuxiliar;
				if (aux.tieneHijos()) { 
					ListaGenerica<ArbolGeneral<String>> lHijos = aux.getHijos();
					lHijos.comenzar();
					
					while (!lHijos.fin()) {
						cantidadHijos++;
						cola.encolar(lHijos.proximo());
					}
					caudalAuxiliar = caudalAuxiliar / cantidadHijos;
				} else 
					caudalAuxiliar = 0.0;
				
			}
			
		
			
			
		}
		
		
		
	}
	
	
	

}
