
public class PilaNum extends Vector {
	// Ponemos los atributos y los encapsulamos
	private int tope;

	// Creamos el constructor
	PilaNum() {
		// el constructor pone valores por defecto a
		// los atributos cuando creamos un objeto
		tope = -1;
	}

	// Para ver si la pila actualmente esta vacia
	// Creamos una funcion booleana

	boolean esVacia() {
		if (tope == -1) {
			return true;
		} else {
			return false;
		}
	}

	boolean esLlena() {
		if (tope == (max - 1)) {
			return true;
		} else {
			return false;
		}
	}

	void adicionar(int x) {
		// Si la pila esta llena no adicionamos
		if (this.esLlena()) {
			System.out.println("Pila llena");
		} else {
			// Si no esta llena recorremos el tope y
			// adicionamos
			tope = tope + 1;
			v[tope] = x;
		}
	}

	// Funcion que devuelve el ultimo elemento
	int eliminar() {
		int x = -1;
		if (this.esVacia()) {
			System.out.println("Pila vacia");
		} else {
			x = v[tope];
			tope = tope - 1;
		}
		return x;
	}

	// Si queremos adicionar n elementos
	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			int x = Leer.datoInt();
			this.adicionar(x);
		}
	}

	// Si quiero traspasar TODOD el contenido
	// de una pila a otra...
	void vaciar(PilaNum Z) {
		while (!Z.esVacia()) {
			int x = Z.eliminar();
			this.adicionar(x);
		}
	}

	void mostrar() {
		if (this.esVacia()) {
			System.out.println("Pila vacia");
		} else {
			System.out.println("Datos de la Pila:");
			PilaNum auxPila = new PilaNum();
			while (!this.esVacia()) {
				int x = this.eliminar();
				System.out.println(x);
				auxPila.adicionar(x);
			}
			this.vaciar(auxPila);
		}
	}

	// Funcion para retornar el nro de elementos
	int nroElem() {
		return tope + 1;
	}

	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

}
