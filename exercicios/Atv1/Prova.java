package Atv1;
public class Prova extends Avaliacao {
    private Double tempoDuracao;
    private int quantidadeDeQuestoes;
    private boolean consultaAutorizada;

    public Prova(String nome, Double nota, Double tempo, int qtdQuestoes, boolean consulta) {
        super(nome, nota);
        this.tempoDuracao = tempo;
        this.quantidadeDeQuestoes = qtdQuestoes;
        this.consultaAutorizada = consulta;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + 
               ", Duração: " + tempoDuracao + "h" +
               ", Questões: " + quantidadeDeQuestoes + 
               ", Consulta autorizada: " + (consultaAutorizada ? "Sim" : "Não");
    }
}