package Atv1Abstract;

public class Bimestre {

	public static void main(String[] args) {
		Avaliacao prova=new Prova("Guilherme", 8, 67, 89, true);
		Avaliacao estudoDirigido=new EstudoDirigido("Guilherme", 8, 67, "Algoritmos");
		Avaliacao seminario=new Seminario("Guilherme",7,6,"Processadores");
		System.out.println(prova.getInfo()+" - Nota da prova : " + prova.getNota());
		System.out.println(estudoDirigido.getInfo()+" - Nota do estudo : " + estudoDirigido.getNota());
		System.out.println(seminario.getInfo()+" - Nota do seminário : " + prova.getNota());
	}

}
