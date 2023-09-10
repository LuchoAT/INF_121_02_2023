package Ejemplo_ColaSimpleNum;

public class ColaSimple extends Cola {
	ColaSimple() {
		super();
	}

	// Para ver si una cola esta vacia
	boolean esVacia() {
		if (fr == fi) {
			return true;
		} else {
			return false;
		}
	}

	// Para ver si una cola esta llena
	boolean esLlena() {
		if (fi == max - 1) {
			return true;
		} else {
			return false;
		}
	}

	void adicionar(int x) {
		if (esLlena()) {
			System.out.println("Cola simple llena!");
		} else {
			fi++;
			v[fi] = x;
		}
	}

	int eliminar() {
		int x = 0;
		if (esVacia()) {
			System.out.println("Cola simple vacia!");
		} else {
			fr++;
			x = v[fr];
		}
		return x;
	}

	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			int x = Leer.datoInt();
			adicionar(x);
		}
	}

	int nroElem() {
		return fi - fr;
	}

	void vaciar(ColaSimple Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	void mostrar() {
		if (esVacia()) {
			System.out.println("Cola simple vacia");
		} else {
			System.out.println("Datos de la cola simple:");
			ColaSimple colaAux = new ColaSimple();
			while (!esVacia()) {
				int x = eliminar();
				System.out.println(x);
				colaAux.adicionar(x);
			}
			vaciar(colaAux);
		}

	}

}
