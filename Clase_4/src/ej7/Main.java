package ej7;

public class Main {

	// Inciso a)
	static boolean verif(ColaCircularCh A, String X) {
		int existe = 0;
		int n = A.nroElem();
		for (int i = 0; i < n; i++) {
			// Con el orden actual vemos si podemos formar una cadena
			String cadenaAuxiliar = "";
			for (int j = 0; j < n; j++) {
				char c = A.eliminar();
				A.adicionar(c);
				cadenaAuxiliar += c;
				if (cadenaAuxiliar.equals(X)) {
					existe = 1;
				}
			}
			char che = A.eliminar();
			A.adicionar(che);
		}
		if (existe == 1) {
			return true;
		} else {
			return false;
		}
	}

	// Inciso b) mover los mas repetidos al principio
	static void moverPrin(ColaCircularCh A) {
		int maximaCantidad = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			// Para cada caracter veo cuantas veces existe
			int n = A.nroElem();
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				char x = A.eliminar();
				if (x == ch) {
					cnt++;
				}
				A.adicionar(x);
			}
			if (cnt > maximaCantidad) {
				maximaCantidad = cnt;
			}
		}
		// Vamos a ver que letras tienen esa cantidad de repeticiones
		ColaCircularCh principio = new ColaCircularCh();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			// Para cada caracter veo cuantas veces existe
			int n = A.nroElem();
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				char x = A.eliminar();
				if (x == ch) {
					cnt++;
				}
				A.adicionar(x);
			}
			if (cnt == maximaCantidad) {
				// movemos a las letras con el valor ch al principio
				int m = A.nroElem();
				for (int i = 0; i < m; i++) {
					char x = A.eliminar();
					if (x == ch) {
						principio.adicionar(x);
					} else {
						A.adicionar(x);
					}
				}
			}
		}
		principio.vaciar(A);
		A.vaciar(principio);
	}

	// Inciso c)
	// Eliminar repetidos y conservar solo uno
	static void eliRep(ColaCircularCh A) {
		ColaCircularCh aux = new ColaCircularCh();
		ColaCircularCh sinRep = new ColaCircularCh();
		while (!A.esVacia()) {
			char x = A.eliminar();
			// Quiero ver quienes despues de x son diferentes
			while (!A.esVacia()) {
				char y = A.eliminar();
				if (x != y) {
					aux.adicionar(y);
				}
			}
			sinRep.adicionar(x);
			A.vaciar(aux);
		}
		A.vaciar(sinRep);
	}

	// Inciso d)

	static void invertir(ColaCircularCh A) {
		int n = A.nroElem() - 1;// en n iteraciones la cola estara invertida
		int rango = A.nroElem() - 1;
		for (int i = 1; i <= n; i++) {
			char x = A.eliminar();
			for (int j = 1; j <= n; j++) {
				char y = A.eliminar();
				A.adicionar(y);
				if (j == rango) {
					A.adicionar(x);
					rango--;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColaCircularCh A = new ColaCircularCh();
		int n = Leer.datoInt();
		A.llenar(n);
		A.mostrar();

		// Inciso a)
		if (verif(A, "DIA")) {
			System.out.println("Existe!");
		} else {
			System.out.println("No existe pe!");
		}
		// Inciso b)
		// moverPrin(A);
		// A.mostrar();
		// Inciso c)
		// eliRep(A);
		// A.mostrar();

		// Inciso d)
		// invertir(A);
		// A.mostrar();

	}

}
