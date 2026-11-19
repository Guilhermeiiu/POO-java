package Sistema1;

public class NoSolicitacao {
    Manutencao manutencao;
    NoSolicitacao proximo;

    public NoSolicitacao() {
    }

    public NoSolicitacao(Manutencao manutencao) {
        this.manutencao = manutencao;
        this.proximo = null;
    }

    public Manutencao getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao manutencao) {
        this.manutencao = manutencao;
    }

    public NoSolicitacao getProximo() {
        return proximo;
    }

    public void setProximo(NoSolicitacao proximo) {
        this.proximo = proximo;
    }
}