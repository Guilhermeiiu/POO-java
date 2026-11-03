package Atv1;

public class EstudoDirigido extends Avaliacao {
    private String tema;
    private int numeroDePaginas;

    public EstudoDirigido(String nome, Double nota, int numPaginas, String tema) {
        super(nome, nota);
        this.numeroDePaginas = numPaginas;
        this.tema = tema;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + 
               ", Tema: " + tema + 
               ", Nº de Páginas: " + numeroDePaginas;
    }
}
