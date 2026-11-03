package Atv2Abstract;

public class PagamentoEmCartao extends Pagamento {
	String bandeira;
	long numTransacao;
	PagamentoEmCartao(double valor, String bandeira, long numeroTransacao){
		this.bandeira=bandeira;
		this.numTransacao=numeroTransacao;
	}
}
