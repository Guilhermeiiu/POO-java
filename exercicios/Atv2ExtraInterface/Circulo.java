package Atv2ExtraInterface;

public class Circulo implements IFormaGeometrica {
	double raio;
	double pi= 3.14;
	Circulo(double raio, double pi){
		this.raio=raio;
		this.pi=pi;
	}
	@Override
	public double area() {
		return pi*raio*raio;
	}
	@Override
	public double comprimento() {
		return 2*pi*raio;
	}

}
