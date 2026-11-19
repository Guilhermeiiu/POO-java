package Atv2interface;

public class Adicao implements OperacaoMatematica {
	public Adicao() {};
	
	@Override
	public int calcula(int a,int b) {
		return a+b; 
	}
}
