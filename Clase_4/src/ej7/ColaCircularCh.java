package ej7;

public class ColaCircularCh extends ColaCh {

	ColaCircularCh() {
		super();
	}

	// Que metodos/funciones tiene una cola circular?

	// Para ver el nroElementos
	int nroElem() {
		return ((fi - fr) + max) % max;
	}

	// Para ver si esta vacia la CC
	boolean esVacia() {
		if (nroElem() == 0) {
			return true;
		}
		return false;
	}

	boolean esLlena() {
		if (nroElem() == max - 1) {
			return true;
		} else {
			return false;
		}
	}

	void adicionar(char x) {
		if (!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = x;
		} else {
			System.out.println("Cola circular llena!");
		}
	}

	char eliminar() {
		char x = ' ';
		if (!esVacia()) {
			fr = (fr + 1) % max;
			x = v[fr];
		} else {
			System.out.println("Cola circular vacia!");
		}
		return x;
	}

	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			String x = Leer.dato();
			adicionar(x.charAt(0));
		}
	}

	void vaciar(ColaCircularCh Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	void mostrar() {
		if (esVacia()) {
			System.out.println("Cola circular vacia");
		} else {
			ColaCircularCh aux = new ColaCircularCh();
			System.out.println("Datos de la cola circular:");
			while (!esVacia()) {
				char x = eliminar();
				System.out.println(x);
				aux.adicionar(x);
			}
			vaciar(aux);
		}

	}

}
