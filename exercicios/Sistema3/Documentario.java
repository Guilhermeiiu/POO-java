package Sistema3;

public class Documentario extends ProdutoAudioVisual {
    private boolean ganhouOscar;
    private int duracao;

    public Documentario(long id, String titulo, int ano, String diretor, int duracao, boolean ganhouOscar) {
        super(id, titulo, ano, diretor);
        this.ganhouOscar = ganhouOscar;
        this.duracao = duracao;
    }

    public void ganhouOscar(boolean ganhou) {
        this.ganhouOscar = ganhou;
    }

    public void alterarDuracao(int minutos) {
        this.duracao = minutos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Duração: " + duracao + " min");
        System.out.println(ganhouOscar ? "Ganhou o Oscar!!" : "Não ganhou o Oscar");
    }
}