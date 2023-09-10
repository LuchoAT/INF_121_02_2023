package Clase_3_ej5;

public class Main {

	// a) Ordenar por año ascend.
	static void ordenarAsc(ColaSimpleA A) {
		ColaSimpleA aux = new ColaSimpleA();
		ColaSimpleA ord = new ColaSimpleA();
		while (!A.esVacia()) {
			int minValor = 100000;
			while (!A.esVacia()) {
				Automovil x = A.eliminar();
				if (x.getAño() < minValor) {
					minValor = x.getAño();
				}
				aux.adicionar(x);
			}
			A.vaciar(aux);

			while (!A.esVacia()) {
				Automovil x = A.eliminar();
				if (x.getAño() == minValor) {
					ord.adicionar(x);
				} else {
					aux.adicionar(x);
				}
			}
			A.vaciar(aux);
		}
		A.vaciar(ord);
	}

	// Inciso b)
	static void mostrarPlaca(ColaSimpleA A) {
		// Vamos a resolver esto sin colaAuxiliar
		int añoPeque = 1000000;
		int n = A.nroElem();
		for (int i = 0; i < n; i++) {
			Automovil x = A.eliminar();
			if (x.getAño() < añoPeque) {
				añoPeque = x.getAño();
			}
			A.adicionar(x);
			;
		}
		// ahora mostramos las placas con una estructura auxiliar
		ColaSimpleA aux = new ColaSimpleA();
		while (!A.esVacia()) {
			Automovil x = A.eliminar();
			if (x.getAño() == añoPeque) {
				System.out.println(x.getPlaca());
			}
			aux.adicionar(x);
		}
		A.vaciar(aux);
	}

	static void agrupar(ColaSimpleA A) {
		ColaSimpleA aux = new ColaSimpleA();
		ColaSimpleA resp = new ColaSimpleA();
		while (!A.esVacia()) {
			Automovil x = A.eliminar();
			while (!A.esVacia()) {
				Automovil y = A.eliminar();
				if (x.getMarca().equals(y.getMarca())) {
					resp.adicionar(y);
				} else {
					aux.adicionar(y);
				}
			}
			resp.adicionar(x);
			A.vaciar(aux);
		}
		A.vaciar(resp);

	}

	public static void main(String[] args) {

		ColaSimpleA A = new ColaSimpleA();
		int n = Leer.datoInt();
		A.llenar(n);
		A.mostrar();
		//Inciso a)
		ordenarAsc(A);
		A.mostrar();
		
		//Inciso b)
		mostrarPlaca(A);
		
		
		//Inciso c)
		agrupar(A);
		A.mostrar();
		
	}

}
