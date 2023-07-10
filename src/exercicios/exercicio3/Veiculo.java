package exercicios.exercicio3;

public class Veiculo {
	
	private int velocidadeMaxima;
	private String marca;
	private String modelo;
	
	public int acelerar() {
		System.out.println("Acelerou!");
		return getVelocidadeMaxima();
	}

	public Veiculo(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public static void main(String[] args) {
		Carro c = new Carro(60);
		System.out.println(c.acelerar());
		
		Moto m = new Moto(120);
		System.out.println(m.acelerar());
	}
}
