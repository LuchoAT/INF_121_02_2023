package Clase_3_ej5;

public class ColaSimpleA extends ColaA {
	ColaSimpleA() {
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

	void adicionar(Automovil x) {
		if (esLlena()) {
			System.out.println("Cola simple llena!");
		} else {
			fi++;
			v[fi] = x;
		}
	}

	Automovil eliminar() {
		Automovil x = new Automovil();
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
			Automovil x = new Automovil();
			x.leer();
			adicionar(x);
		}
	}

	int nroElem() {
		return fi - fr;
	}

	void vaciar(ColaSimpleA Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	void mostrar() {
		if (esVacia()) {
			System.out.println("Cola simple vacia");
		} else {
			System.out.println("Datos de la cola simple:");
			ColaSimpleA colaAux = new ColaSimpleA();
			while (!esVacia()) {
				Automovil x = eliminar();
				x.mostrar();
				colaAux.adicionar(x);
			}
			vaciar(colaAux);
		}

	}

}
