package exercicios.exercicio4;

public class MainPagamento {
	public static void main(String[] args) {
		PagamentoBoleto pagamentoBoleto = new PagamentoBoleto("Cliente 1");
		pagamentoBoleto.processarPagamento(100);
		System.out.println("\n\n---------------------------------------------\n\n");
		PagamentoCartao pagamentoCartao= new PagamentoCartao("Cliente 2");
		pagamentoCartao.processarPagamento(2000);
	}

}
