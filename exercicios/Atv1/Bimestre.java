package Atv1;

public class Bimestre {
    private String idBimestre;
    private Avaliacao av1;
    private Avaliacao av2;
    private Avaliacao av3;

    public Bimestre(String idBimestre, Avaliacao av1, Avaliacao av2, Avaliacao av3) {
        this.idBimestre = idBimestre;
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    public void imprimirAvaliacoes() {
        System.out.println("Bimestre: " + idBimestre + " ==");
        if (av1 != null) System.out.println("AV1 -> " + av1.getInfo());
        if (av2 != null) System.out.println("AV2 -> " + av2.getInfo());
        if (av3 != null) System.out.println("AV3 -> " + av3.getInfo());
    }
}
