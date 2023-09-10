package Clase_2_ej1;

public class Practica {
	// encapsulamos los atributos
	private int nroPractica, nota;
	private String nombre;

	Practica() {
		nroPractica = 0;
		nota = 0;
		nombre = "";
	}

	void mostrar() {
		System.out.println("Practica[" + nroPractica + ", " + nota + ", " + nombre + "]");
	}

	void leer() {
		System.out.println("Practica");
		System.out.println("nroPractica?");
		nroPractica = Leer.datoInt();
		System.out.println("nota?");
		nota = Leer.datoInt();
		System.out.println("nombre?");
		nombre = Leer.dato();
	}

	public int getNroPractica() {
		return nroPractica;
	}

	public void setNroPractica(int nroPractica) {
		this.nroPractica = nroPractica;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
