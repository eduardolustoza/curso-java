package exercicios.exercicio2;

public class CadastroContas {
	public static void main(String[] args) {
		Conta conta11 = new Conta(11, 0.0);
		Conta conta22 = new Conta(22, 20.0);
		ContaCorrente contaCorrente1 = new ContaCorrente(1, 0.0);
		ContaCorrente contaCorrente2 = new ContaCorrente(2, 10.0);
		System.out.println("Depositando 20 na conta número: " + conta11.getNumero());
		conta11.depositar(20.0);
		System.out.println("Saldo na Conta Número " + conta11.getNumero() + ": " +conta11.consultarSaldo());
		System.out.println("Sacando 20 na conta número: " + conta11.getNumero());
		conta11.sacar(20.0);
		System.out.println("Saldo na Conta Número " + conta11.getNumero() + ": " +conta11.consultarSaldo());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Depositando 20 na conta número: " + conta22.getNumero());
		conta22.depositar(20.0);
		System.out.println("Saldo na Conta Número " + conta22.getNumero() + ": " +conta22.consultarSaldo());
		System.out.println("Sacando 20 na conta número: " + conta22.getNumero());
		conta22.sacar(20.0);
		System.out.println("Saldo na Conta Número " + conta22.getNumero() + ": " +conta22.consultarSaldo());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Depositando 20 na conta número: " + contaCorrente1.getNumero());
		contaCorrente1.depositar(20.0);
		System.out.println("Saldo na Conta Número " + contaCorrente1.getNumero() + ": " +contaCorrente1.consultarSaldo());
		System.out.println("Sacando 20 na conta número: " + contaCorrente1.getNumero());
		contaCorrente1.sacar(20.0);
		System.out.println("Saldo na Conta Número " + contaCorrente1.getNumero() + ": " +conta22.consultarSaldo());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Depositando 20 na conta número: " + contaCorrente2.getNumero());
		contaCorrente2.depositar(1.0);
		System.out.println("Saldo na Conta Número " + contaCorrente2.getNumero() + ": " +contaCorrente2.consultarSaldo());
		System.out.println("Sacando 20 na conta número: " + contaCorrente2.getNumero());
		contaCorrente2.sacar(30.0);
		System.out.println("Saldo na Conta Número " + contaCorrente2.getNumero() + ": " +conta22.consultarSaldo());
		
	}
}
