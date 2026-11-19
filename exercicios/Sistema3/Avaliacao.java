package Sistema3;

import java.util.Date;

public class Avaliacao {
    private long id;
    private Date data;
    private ProdutoAudioVisual produto;
    private String avaliacao;

    public Avaliacao(long id, Date data, ProdutoAudioVisual produto, String avaliacao) {
        this.id = id;
        this.data = data;
        this.produto = produto;
        this.avaliacao = avaliacao;
    }
    public void alterarAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void alterarProduto(ProdutoAudioVisual produto) {
        this.produto = produto;
    }

    public void imprimirAvaliacao() {
        System.out.println("==================================");
        produto.imprimir();
        System.out.println("----------------------------------");
        System.out.println("Avaliação (#" + id + "): " + avaliacao);
        System.out.println("Data: " + data);
        System.out.println("==================================\n");
    }
}