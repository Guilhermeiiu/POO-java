package Sistema3;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private long id;
    private String nome;
    private Set<Avaliacao> avaliacoes;

    public Usuario(long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.avaliacoes = new HashSet<>();
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAvaliacao(Avaliacao av) {
        avaliacoes.add(av);
    }

    public void removerAvaliacao(Avaliacao av) {
        avaliacoes.remove(av);
    }

    public void imprimirAvaliacoes() {
        System.out.println(">>> Avaliações de " + nome + " (ID: " + id + ") <<<\n");
        if (avaliacoes.isEmpty()) {
            System.out.println("Nenhuma avaliação registrada.");
            return;
        }
        for (Avaliacao av : avaliacoes) {
            av.imprimirAvaliacao();
        }
    }
}