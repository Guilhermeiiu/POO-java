package Atv1ExtraInterface;

public class Diretor implements IColaborador {
	String nome;
	Double valorBaseHora;
	int carga;
	Diretor(String nome,double valorBaseHora, int carga){
		this.nome=nome;
		this.valorBaseHora=valorBaseHora;
		this.carga=carga;
	}

	@Override
	public int cargaHoraria() {
		return carga;
	}
	
	public String nome() {
		return nome;
	}
	
	@Override
	public double obtemSalario() {
		return valorBaseHora*carga;
	}

}

