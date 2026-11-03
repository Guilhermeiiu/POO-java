package Atv1;

public abstract class Avaliacao {
    private String nome;
    private Double nota;

    public Avaliacao(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public String getInfo() {
        return "Nome: " + nome + ", Nota: " + nota;
    }
}
