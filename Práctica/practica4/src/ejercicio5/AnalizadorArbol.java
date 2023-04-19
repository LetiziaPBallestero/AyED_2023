package ejercicio5;

import colaPila.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 * Donde AreaEmpresa es una clase que representa a un área de la empresa
 * mencionada y que contiene la identificación de la misma representada con un
 * String y una tardanza de transmisión de mensajes interna representada con int
 **/

public class AnalizadorArbol {

	public int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		ArbolGeneral<AreaEmpresa> aux;

		cola.encolar(arbol);
		cola.encolar(null);

		int max = -1;
		int prom=0, cant = 0, suma = 0;

		while (!cola.esVacia()) {
			aux = cola.desencolar();
			if (aux != null) {
				cant++;
				suma = suma + aux.getDato().getTardanza();
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> lhijos = aux.getHijos();
					lhijos.comenzar();
					while (!lhijos.fin())
						
						cola.encolar(lhijos.proximo());
				}
			}
			else { 
				// final de nivel
				prom = suma / cant;
				suma=0;
				cant=0;
				if (prom > max)
					max = prom;
				if (!cola.esVacia()) {
					cola.encolar(null);
				}
				
			}
		}
		return max;

	}

}
