
public class Main {

	// Inciso a) Eliminar pares

	static void eliPares(PilaNum A) {
		PilaNum aux = new PilaNum();
		// Traspasar todo de A a aux
		while (!A.esVacia()) {
			int x = A.eliminar();
			if (x % 2 == 1) {
				aux.adicionar(x);
			}
		}
		A.vaciar(aux);
	}

	// Inciso b) Mandar al principio un valor x
	static void mandarPrin(PilaNum A, int x) {
		PilaNum auxPila = new PilaNum();
		auxPila.vaciar(A);
		A.adicionar(x);
		A.vaciar(auxPila);
	}

	// Inciso c) Contar cuantos 3's hay
	static int contar(PilaNum A) {
		int cnt = 0;
		PilaNum auxPila = new PilaNum();
		while (!A.esVacia()) {
			int x = A.eliminar();
			if (x == 3) {
				cnt = cnt + 1;
			}
			auxPila.adicionar(x);
		}
		A.vaciar(auxPila);
		return cnt;
	}

	public static void main(String[] args) {

		PilaNum A = new PilaNum();
		int n = Leer.datoInt();
		A.llenar(n);
		A.mostrar();
		/*
		 * //Inciso a) 
		 * eliPares(A); 
		 * A.mostrar();
		 */

		/*// Inciso b)
		mandarPrin(A, 0);
		A.mostrar();*/
		//Inciso c)
		int respuesta=contar(A);
		System.out.println("Hay una cantidad de "+respuesta+" numeros 3");
		
		

	}

}
