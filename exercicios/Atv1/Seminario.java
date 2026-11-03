package Atv1;

public class Seminario extends Avaliacao {
    private String tema;
    private Double tempoDuracao;

    public Seminario(String nome, Double nota, Double tempo, String tema) {
        super(nome, nota);
        this.tempoDuracao = tempo;
        this.tema = tema;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + 
               ", Tema: " + tema + 
               ", Duração: " + tempoDuracao + "h";
    }
}
