package Atv2interface;
import java.util.Scanner;
public class OperacaoMatematicaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Número 1 :");
		int num1=scan.nextInt();
		System.out.println("Número 2 :");
		int num2=scan.nextInt();
		
		System.out.println("Qual operacão vai querer? (1- adição ; 2- subtração ; 3- multiplicação ; 4- divisão)");
		int resp=scan.nextInt();
		switch (resp) {
			case 1:
				OperacaoMatematica adicao= new Adicao();
				System.out.println("= "+adicao.calcula(num1,num2));
				break;
			case 2:
				OperacaoMatematica sub= new Subtracao();
				System.out.println("= "+sub.calcula(num1,num2));
				break;
			case 3:
				OperacaoMatematica mult= new Multiplicacao();
				System.out.println("= "+mult.calcula(num1,num2));
				break;
			case 4:
				OperacaoMatematica div= new Divisao();
				System.out.println("= "+div.calcula(num1,num2));
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		scan.close();
	}

}
