package exercicios.exercicio2;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}
	
	@Override
    public void sacar(double valor) {
        double saldo = getSaldo();
		if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
