package Ejercicio3;


public class PilaC extends Vector {
	// Ponemos los atributos y los encapsulamos
	private int tope;

	// Creamos el constructor
	PilaC() {
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

	void adicionar(Caja x) {
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
	Caja eliminar() {
		Caja x=new Caja();
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
			Caja x=new Caja();
			x.leer();
			this.adicionar(x);
		}
	}

	// Si quiero traspasar TODOD el contenido
	// de una pila a otra...
	void vaciar(PilaC Z) {
		while (!Z.esVacia()) {
			Caja x = Z.eliminar();
			this.adicionar(x);
		}
	}

	void mostrar() {
		if (this.esVacia()) {
			System.out.println("Pila vacia");
		} else {
			System.out.println("Datos de la Pila:");
			PilaC auxPila = new PilaC();
			while (!this.esVacia()) {
				Caja x = this.eliminar();
				x.mostrar();
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
