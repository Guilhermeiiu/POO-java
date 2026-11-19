package Sistema1;

public abstract class Pessoa implements Imprimivel {
    static long contadorId = 1;
    long id;
    String nome;
    String telefone;

    public Pessoa() {
        this.id = contadorId++;
    }

    public Pessoa(String nome, String telefone) {
        this.id = contadorId++;
        this.nome = nome;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public abstract void imprimirDetalhado();
}