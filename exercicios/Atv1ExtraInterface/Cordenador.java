package Atv1ExtraInterface;

public class Cordenador implements IColaborador {
	String nome;
	Double valorBaseHora;
	int carga;
	Cordenador(String nome,double valorBaseHora, int carga){
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
