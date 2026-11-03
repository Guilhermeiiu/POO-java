package Atv1Abstract;

public abstract class Avaliacao {
	String nome;
	double nota;
	public Avaliacao(String nome, double nota) {
		this.nome=nome;
		this.nota=nota; }
	public abstract String getInfo();
	public abstract double getNota();
	
}
