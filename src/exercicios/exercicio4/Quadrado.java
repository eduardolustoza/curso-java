package exercicios.exercicio4;

public class Quadrado implements Figura{
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.sqrt(getLado());
	}

	@Override
	public double calcularPerimetro() {
		return getLado()*4;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
