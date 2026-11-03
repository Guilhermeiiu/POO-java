package Atv1Abstract;

public class Prova extends Avaliacao {
	double tempoDuracao;
	int quantidadeDeQuestoes;
	boolean consultaAutorizada;
	Prova(String nome, double nota, double tempo, int qtdQuestoes, boolean consulta ){
		super(nome,nota);
		this.quantidadeDeQuestoes=qtdQuestoes;
		this.consultaAutorizada=consulta;
		this.tempoDuracao=tempo;
	}
	@Override
	public String getInfo() {
		return nome;
	}
	
	@Override
	public double getNota() {
		return nota;
	}

}
