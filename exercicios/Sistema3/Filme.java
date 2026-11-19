package Sistema3;

import java.util.HashSet;
import java.util.Set;

public class Filme extends ProdutoAudioVisual {
    private Set<String> atores;
    private int duracao;
    private boolean ganhouOscar;

    public Filme(long id, String titulo, int ano, String diretor, int duracao, boolean ganhouOscar) {
        super(id, titulo, ano, diretor);
        this.duracao = duracao;
        this.atores = new HashSet<>();
        this.ganhouOscar = ganhouOscar;
    }

    public void adicionarAtor(String nome) {
        atores.add(nome);
    }

    public void removerAtor(String nome) {
        atores.remove(nome);
    }

    public void alterarDuracao(int minutos) {
        this.duracao = minutos;
    }

    public void ganhouOscar(boolean ganhou) {
        this.ganhouOscar = ganhou;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Atores: " + atores);
        System.out.println("Duração: " + duracao + " min");
        System.out.println(ganhouOscar ? "Ganhou o Oscar!!" : "Não ganhou o Oscar");
    }
}