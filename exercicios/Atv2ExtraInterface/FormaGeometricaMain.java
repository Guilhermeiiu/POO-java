package Atv2ExtraInterface;
import java.util.Scanner;
public class FormaGeometricaMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Largura:");
		double largura=scan.nextDouble();
		System.out.println("Comprimento:");
		double comprimento=scan.nextDouble();
		
		System.out.println("Forma geométrica: (1-quadrado, 2-retangulo, 3-circulo)");
		int resp=scan.nextInt();
		switch(resp) {
			case 1:
				IFormaGeometrica quadrado=new Quadrado(largura,comprimento);
				if (largura!=comprimento) {
					break;
				}
				System.out.println("Aréa : "+quadrado.area()+" Comprimento : "+quadrado.comprimento());
				break;
			case 2:
				IFormaGeometrica retangulo=new Retangulo(largura,comprimento);

				System.out.println("Aréa : "+retangulo.area()+" Comprimento : "+retangulo.comprimento());
				break;
			case 3:
				IFormaGeometrica circulo=new Circulo(largura,comprimento);

				System.out.println("Aréa : "+circulo.area()+" Comprimento : "+circulo.comprimento());
				break;
		}
		scan.close();
	}

}
