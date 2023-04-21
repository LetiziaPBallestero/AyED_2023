System.out.println("NIVEL "+nivel+" : ");
		while (!cola.esVacia()) {
			int cantidad = 0;
			
			aux = cola.desencolar();
			auxCaudal = colaCaudal.desencolar();
			
			if (aux != null) {				
				System.out.println("NODO: "+ aux.getDato() + " CAUDAL: " + auxCaudal);
				if (auxCaudal < min)
					min = auxCaudal;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> lhijos = aux.getHijos();
					lhijos.comenzar();
					while (!lhijos.fin()) {
						cantidad++;
						cola.encolar(lhijos.proximo());
					}
					auxCaudal = auxCaudal / (double) cantidad;
				}
				else 
					auxCaudal = 0.0;
				for (int i= 0; i < cantidad; i++)
					colaCaudal.encolar(auxCaudal);	

			}
		else
			if (!cola.esVacia()) {
				cola.encolar(null);
				colaCaudal.encolar(0.0);
				nivel++;
				System.out.println("NIVEL "+nivel+" : ");
			}	
		}
		System.out.println(" ");
		return min;
	}
	
	public double minimoCaudal2(double caudal) {
		return minimoCaudal2(caudal,estructura);
	}
	
	private double minimoCaudal2 (double caudal,ArbolGeneral<T> a) {
		double min = 9999.99;
		if (a.esHoja()) {
			System.out.println("NODO: "+ a.getDato()+" CAUDAL: "+ caudal);
			return caudal;
		}
		if(a.tieneHijos()) {
			System.out.println("NODO: "+ a.getDato()+" CAUDAL: "+ caudal);
			ListaGenerica<ArbolGeneral<T>> l = a.getHijos();
			caudal = caudal /(double) l.tamanio();
			l.comenzar();
			while (!l.fin()) {
				min = Math.min(min,minimoCaudal2(caudal,l.proximo()));
			}
		}
		return min;
	}package ejercicio7;

public class Auxs {

}
