package Atv2interface;

public class Subtracao implements OperacaoMatematica {
	public Subtracao() {};
	
	@Override
	public int calcula(int a,int b) {
		return a-b; 
	}
}
