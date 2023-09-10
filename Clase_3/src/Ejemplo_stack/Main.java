package Ejemplo_stack;

import java.util.Stack; //La libreria de la pila

public class Main {

	public static void main(String[] args) {

		// Una pila de tipo int
		Stack<Integer> pila1 = new Stack<Integer>(); 
		// Una pila de tipo String
		Stack<String> pila2 = new Stack<String>();
		// Una pila de caracteres
		Stack<Character> pila3 = new Stack<Character>();

		// Una pila de un objeto creado (La caja de la anterior clase :v)
		Stack<Double> pila4 = new Stack<Double>();
		Stack<Caja> pilaCaja = new Stack<Caja>();
		Caja c1 = new Caja();
		Caja c2 = new Caja();
		Caja c3 = new Caja();
		c1.leer();
		c2.leer();
		c3.leer();
		pilaCaja.push(c1);
		pilaCaja.push(c2);
		pilaCaja.push(c3);

		Stack<Caja> pilaAux = new Stack<Caja>();

		// Para mostrar un Stack:
		while (!pilaCaja.isEmpty()) {
			Caja x = pilaCaja.peek();// solo accede al ultimo elemento
			x.mostrar();
			pilaAux.push(x);
			pilaCaja.pop();// recien lo quita
		}

		System.out.println(pilaCaja.size());

	}

}
