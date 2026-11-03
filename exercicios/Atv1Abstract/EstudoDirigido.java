package Atv1Abstract;

public class EstudoDirigido extends Avaliacao {
	String tema;
	int numeroDePaginas;
	EstudoDirigido(String nome, double nota, int numPaginas, String tema){
		this.tema=tema;
		this.numeroDePaginas=numPaginas;
		super(nome,nota);
	}
	
	@Override 
	public double getNota() {
		return nota;
	}
	@Override 
	public String getInfo() {
		return nome;
	}
}
