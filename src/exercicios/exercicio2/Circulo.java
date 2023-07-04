package exercicios.exercicio2;

import dependencia.Forma;

public class Circulo extends Forma {
	
	private double raio;

	@Override
	public double calcularArea() {
		return Math.PI*raio;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public static void main(String[] args) {
		System.out.println(new Circulo(2.0).calcularArea());
	}
}
