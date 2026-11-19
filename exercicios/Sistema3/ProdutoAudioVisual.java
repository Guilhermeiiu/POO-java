package Sistema3;

public abstract class ProdutoAudioVisual {
    protected long id;
    protected String titulo;
    protected int ano;
    protected String diretor;

    public ProdutoAudioVisual(long id, String titulo, int ano, String diretor) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
    }

    public void alterarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void alterarAno(int ano) {
        this.ano = ano;
    }
    public void alterarDiretor(String diretor) {
        this.diretor = diretor;
    }
    public void imprimir() {
        System.out.println("ID: " + id + " | Título: " + titulo + "\nAno: " + ano + " | Diretor: " + diretor);
    }
}