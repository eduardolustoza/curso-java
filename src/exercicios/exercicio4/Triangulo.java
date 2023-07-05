package exercicios.exercicio4;

public class Triangulo implements Figura {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	@Override
	public double calcularArea() {
		double semiPerimetro = calcularSemiPerimetro();
		return Math.sqrt(semiPerimetro
				* (semiPerimetro - getLadoA()) 
				* (semiPerimetro - getLadoB()) 
				* (semiPerimetro - getLadoC()));
	}

	private double calcularSemiPerimetro() {
		return calcularPerimetro()/2;
	}

	@Override
	public double calcularPerimetro() {
		return getLadoA() + getLadoB() + getLadoC();
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(6, 6, 6);
		System.out.println("Perímetro do Triangulo: " + triangulo.calcularPerimetro());
		System.out.println("Área do Triangulo: " + triangulo.calcularArea());
	}

}
