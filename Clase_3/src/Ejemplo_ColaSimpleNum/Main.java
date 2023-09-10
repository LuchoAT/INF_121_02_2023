package Ejemplo_ColaSimpleNum;

public class Main {
	public static void main(String[] args) {
		ColaSimple A=new ColaSimple();
		int n=Leer.datoInt();
		A.llenar(n);
		A.mostrar();
		A.eliminar();
		A.mostrar();
	}
}
