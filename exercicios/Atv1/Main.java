package Atv1;

public class Main {
    public static void main(String[] args) {
 
        Avaliacao prova1 = new Prova("Prova de Matemática", 8.5, 2.0, 10, false);
        Avaliacao seminario1 = new Seminario("Apresentação de História", 9.0, 0.5, "Revolução Industrial");
        Avaliacao estudo1 = new EstudoDirigido("Exercício de Biologia", 9.5, 15, "Genética");

 
        Bimestre primeiroBimestre = new Bimestre("1º Bimestre", prova1, seminario1, estudo1);

 
        primeiroBimestre.imprimirAvaliacoes();
    }
}
