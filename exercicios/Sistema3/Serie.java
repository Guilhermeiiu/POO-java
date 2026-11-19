package Sistema3;
import java.util.*;
public class Serie extends ProdutoAudioVisual{
	Set <String> atores;
	int temporadas;
	Serie(long id,String titulo, int ano, String diretor,int temporadas) {
		super(id, titulo, ano, diretor);
		this.atores=new HashSet<>();
		this.temporadas=temporadas;
	}
	public void adicionarAtor(String nome) {
		atores.add(nome);
	}
	public void removerAtor(String nome) {
		atores.remove(nome);
	}
	public void alterarNumTemporadas(int temporadas) {
		this.temporadas=temporadas;
	}
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Atores: "+atores);
		System.out.println("\nNúmero de temporadas: "+temporadas);
	}

}
