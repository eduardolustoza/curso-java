package exercicios.exercicio4;

public class PagamentoBoleto extends Pagamento implements ProcessadorPagamento {

	public PagamentoBoleto(String dadosCliente) {
		super(dadosCliente);
	}

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Checando dados do cliente: " + getDadosCliente());
		System.out.println("Gerando o boleto com os dados informados.");
		if(true) {
			System.out.println("Boleto Gerado!");
			System.out.println("Informando o cliente do boleto gerado.");
			System.out.println("Boleto gerado para o cliente " + getDadosCliente() + " no valor de: "  + valor);
		} else {
			System.out.println("Boleto não gerado");
			System.out.println("Informando o cliente do boleto não gerado.");
		}

	}


}
