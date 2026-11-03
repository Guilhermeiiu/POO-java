package Atv1Abstract;

public class Seminario extends Avaliacao {
	String tema;
	double tempoDuracao;
	Seminario(String nome, double nota, double tempo, String tema){
		super(nome,nota);
		this.tema=tema;
		this.tempoDuracao=tempo;
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
