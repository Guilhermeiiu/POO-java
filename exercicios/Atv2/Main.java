package Atv2;

public class Main {
    public static void main(String[] args) {
        
        Pagamento pagDinheiro = new PagamentoEmDinheiro(150.00, 200.00);
        NotaFiscal nf1 = new NotaFiscal(101, "Compra de material escolar", pagDinheiro);

        
        Pagamento pagCartao = new PagamentoEmCartao(320.50, "Visa", 9876543210L);
        NotaFiscal nf2 = new NotaFiscal(102, "Aquisição de livro técnico", pagCartao);

        
        System.out.println("NOTA FISCAL 1 \n");
        nf1.imprimirNota();

        System.out.println("NOTA FISCAL 2");
        nf2.imprimirNota();
    }
}
