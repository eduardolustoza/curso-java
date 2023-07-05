package exercicios.exercicio4;

public class Circulo implements Figura{
	
	private double raio;
	
	@Override
	public double calcularArea() {
		return Math.PI*Math.sqrt(getRaio());
	}

	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*getRaio();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

}
