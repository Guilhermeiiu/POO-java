package Atv2ExtraInterface;

public class Retangulo implements IFormaGeometrica {
	double largura;
	double comprimento;
	Retangulo(double largura, double comprimento){
		this.largura=largura;
		this.comprimento=comprimento;
	}
	
	@Override
	public double area(){
		return largura*comprimento;
	} 
	
	@Override
	public double comprimento(){
		return comprimento;
	} 
}
