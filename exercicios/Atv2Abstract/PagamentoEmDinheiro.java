package Atv2Abstract;

public class PagamentoEmDinheiro extends Pagamento {
	double valorRecebido;
	double troco;
	PagamentoEmDinheiro(double valor, double valorRecebido){
		this.valorRecebido=valorRecebido;
		this.troco=valor;
		}
	double valorTotal=valorRecebido-troco;
	@Override 
	public String imprimir() {
		return "Valor total do pagamento : " + valorTotal + "Valor recebido : "+ valorRecebido+ " Troco : "+troco;
	}
}
