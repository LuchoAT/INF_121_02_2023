
public class Main {
//Incisoa) Mostrar todas las practicas con nota de aprobaci´on (nota ≥ 51).

	static void mostrarPra(PilaP A) {
		PilaP auxPila = new PilaP();
		while (!A.esVacia()) {
			Practica x = A.eliminar();
			if (x.getNota() >= 51) {
				x.mostrar();
			}
			auxPila.adicionar(x);
		}
		A.vaciar(auxPila);
	}

//Inciso b) Verificar

	static boolean verif(PilaP A, String X) {
		PilaP auxPila = new PilaP();
		int existe = 0;
		while (!A.esVacia()) {
			Practica x = A.eliminar();
			if (x.getNombre().equals(X)) {
				existe = 1;
			}
			auxPila.adicionar(x);
		}
		A.vaciar(auxPila);
		if (existe == 1) {
			return true;
		} else {
			return false;
		}
	}

	// Inciso c)

	static double calcProm(PilaP A, int k) {
		int contador = 0;
		double suma = 0;
		PilaP auxPila = new PilaP();
		while (!A.esVacia()) {
			Practica x = A.eliminar();
			if (x.getNroPractica() == k) {
				suma = suma + x.getNota();
				contador++;
			}
			auxPila.adicionar(x);
		}
		A.vaciar(auxPila);
		if (contador == 0) {
			System.out.println("Error no existe");
			return -1;
		} else {
			double res = ((double) suma / (double) contador);
			return res;
		}
	}

	public static void main(String[] args) {
		PilaP A = new PilaP();
		int n = Leer.datoInt();
		A.llenar(n);
		A.mostrar();
		System.out.println("----");
		// Inciso a)
		// mostrarPra(A);
		// Inciso b)
		/*
		 * String name = Leer.dato(); if (verif(A, name)) {
		 * System.out.println("Existe alguna practica de " + name); } else {
		 * System.out.println("No existe"); }
		 */

		// Inciso c)
		int k = Leer.datoInt();
		double resp = calcProm(A, k);
		System.out.println("El promedio es: " + resp);
	}

}
