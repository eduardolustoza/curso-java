package exercicios.exercicio4;

public class PagamentoCartao extends Pagamento implements ProcessadorPagamento {

	
	public PagamentoCartao(String dadosCliente) {
		super(dadosCliente);
	}

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Checando dados do cliente: " + getDadosCliente());
		System.out.println("Envio dos dados de compra para a operadora do cartão.");
		if(true) {
			System.out.println("Confirmação da compra!");
			System.out.println("Informando o cliente da compra aprovada.");
			System.out.println("Compra aprovada no valor de: "+ valor);
		} else {
			System.out.println("Compra negada!");
			System.out.println("Informando o cliente da compra negada.");
			System.out.println("Compra negada no valor de: "+ valor);
		}

	}

}
