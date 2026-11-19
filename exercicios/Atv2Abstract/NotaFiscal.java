package Atv2Abstract;

public class NotaFiscal {
	int numero;
	String resumo;
	Pagamento pagamento;
	NotaFiscal(int numero, String resumo, Pagamento pagamento){
		super();
		this.numero=numero;
		this.resumo=resumo;
		this.pagamento=pagamento;
	}
	public void imprimir() {
		System.out.println("Numero: "+numero);
		System.out.println("Resumo: "+resumo);
		System.out.println("Pagamento: "+pagamento);
	}						
}
