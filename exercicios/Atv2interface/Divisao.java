package Atv2interface;

public class Divisao implements OperacaoMatematica {
	public Divisao() {};
	
	@Override
	public int calcula(int a,int b) {
		return a/b; 
	}
}