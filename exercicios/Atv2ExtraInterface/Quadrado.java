package Atv2ExtraInterface;

public class Quadrado implements IFormaGeometrica {
	double largura;
	double comprimento;
	Quadrado(double largura, double comprimento){
		this.largura=largura;
		this.comprimento=comprimento;
	}
	@Override
	public double area() {
		return largura*comprimento;
	}
	@Override
	public double comprimento() {
		return comprimento;
	}
	
	public boolean verificarQuadrado() {
		if (comprimento!=largura) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
