package Ejercicio3;

public class Main {
	// a) Verificar si esta ordenado
	static boolean verif(PilaC A) {
		PilaC auxPila = new PilaC();
		int verif = 1;
		double aux = -10000000;
		while (!A.esVacia()) {
			Caja x = A.eliminar();
			if (aux > x.getArea()) {
				verif = 0;
			}
			aux = x.getArea();
			auxPila.adicionar(x);
		}
		A.vaciar(auxPila);
		if (verif == 1) {
			return true;
		} else {
			return false;
		}
	}

	// b) Ordenar descent. respecto al area
	static void ordenar(PilaC A) {
		PilaC auxPila = new PilaC();
		PilaC ord = new PilaC();
		while (!A.esVacia()) {
			double minValor = 10000000;
			while (!A.esVacia()) {
				Caja x = A.eliminar();
				if (x.getArea() < minValor) {
					minValor = x.getArea();
				}
				auxPila.adicionar(x);
			}
			A.vaciar(auxPila);
			while (!A.esVacia()) {
				Caja x = A.eliminar();
				if (x.getArea() == minValor) {
					ord.adicionar(x);
				} else {
					auxPila.adicionar(x);
				}
			}
			A.vaciar(auxPila);
		}
		A.vaciar(ord);
	}

	// c) Agrupar por color
	static void Agrupar(PilaC A) {
		PilaC auxPila = new PilaC();
		PilaC ans = new PilaC();
		while (!A.esVacia()) {
			Caja x = A.eliminar();
			while (!A.esVacia()) {
				Caja y = A.eliminar();
				if (x.getColor().equals(y.getColor())) {
					ans.adicionar(y);
				} else {
					auxPila.adicionar(y);
				}
			}
			ans.adicionar(x);
			A.vaciar(auxPila);
		}
		A.vaciar(ans);
	}

	public static void main(String[] args) {

		PilaC A = new PilaC();
		int n = Leer.datoInt();
		A.llenar(n);
		A.mostrar();
		if(verif(A)) {
			System.out.println("La pila esta ordenada desc.");
		}else {
			System.out.println("Nel");
		}
		
		

	}

}
