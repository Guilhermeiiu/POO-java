package Sistema1;

public class Morador extends Pessoa {
	String apartamento;
    boolean sindicoResponsavel;

    public Morador() {
        super();
    }

    public Morador(String nome, String telefone, String apartamento, boolean sindicoResponsavel) {
        super(nome, telefone);
        this.apartamento = apartamento;
        this.sindicoResponsavel = sindicoResponsavel;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public boolean isSindicoResponsavel() {
        return sindicoResponsavel;
    }

    public void setSindicoResponsavel(boolean sindicoResponsavel) {
        this.sindicoResponsavel = sindicoResponsavel;
    }

    @Override
    public void imprimirDetalhado() {
        System.out.println("Morador de ID: " + getId() + " - Nome: " + getNome() + " | Telefone: " + getTelefone());
        System.out.println("\nApartamento: " + apartamento + " | Síndico Responsável: " + (sindicoResponsavel ? "Sim" : "Não"));
    }
}