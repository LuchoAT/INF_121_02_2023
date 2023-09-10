package Clase_2_ej3;

public class Caja {
	private double area;
	private String color, contenido;

	Caja() {
		area = 0;
		color = contenido = "";
	}

	void mostrar() {
		System.out.println("Caja[" + area + ", " + color + ", " + contenido + "]");
	}

	void leer() {
		System.out.println("caja...");
		System.out.println("area?");
		area = Leer.datoDouble();
		System.out.println("color?");
		color = Leer.dato();
		System.out.println("contenido?");
		contenido = Leer.dato();
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
