package Clase_3_ej5;

public class Automovil {
	private String placa, tipo, marca;
	private int año;

	Automovil() {
		placa = "";
		tipo = "";
		marca = "";
		año = 0;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	void leer() {
		System.out.println("Automovil....");
		System.out.println("PLaca?");
		placa = Leer.dato();
		System.out.println("Tipo?");
		tipo = Leer.dato();
		System.out.println("Marca?");
		marca = Leer.dato();
		System.out.println("Año?");
		año = Leer.datoInt();
	}

	void mostrar() {
		System.out.println("Automovil[" + placa + ", " + tipo + ", " + marca + ", " + año + "]");
	}
}
