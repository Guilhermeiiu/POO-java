package Atv2Abstract;

public class PagamentoEmCartao extends Pagamento {
	String bandeira;
	long numTransacao;
	PagamentoEmCartao(double valor, String bandeira, long numeroTransacao){
		this.bandeira=bandeira;
		this.numTransacao=numeroTransacao;
		this.valor=valor;
	}
	@Override
	public String imprimir() {
		return "Valor total do pagamento : " + valor + " Bandeira do cartão : "+ bandeira+ " Número de transação: "+ numTransacao;
	}
}
