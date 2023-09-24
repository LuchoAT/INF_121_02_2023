package EjemploColaCircular;

public class ColaCircularN extends ColaN {

	ColaCircularN() {
		super();
	}

	// Que metodos/funciones tiene una cola circular?

	// Para ver el nroElementos
	int nroElem() {
		return ((fi - fr) + max) % max;
	}

	// Para ver si esta vacia la CC
	boolean esVacia() {
		if(nroElem()==0) {
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

	void adicionar(int x) {
		if (!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = x;
		} else {
			System.out.println("Cola circular llena!");
		}
	}

	int eliminar() {
		int x = 0;
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
			int x = Leer.datoInt();
			adicionar(x);
		}
	}

	void vaciar(ColaCircularN Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	void mostrar() {
		if (esVacia()) {
			System.out.println("Cola circular vacia");
		} else {
			ColaCircularN aux = new ColaCircularN();
			System.out.println("Datos de la cola circular:");
			while (!esVacia()) {
				int x = eliminar();
				System.out.println(x);
				aux.adicionar(x);
			}
			vaciar(aux);
		}

	}

}
