package Sistema1;

import java.time.LocalDateTime;

public class Pintura extends Manutencao {
    String corSolicitada;

    public Pintura(long codigo, String descricao, LocalDateTime dataSolicitacao, Morador morador, Funcionario funcionario, String corSolicitada) {
        super(codigo, descricao, dataSolicitacao, morador, funcionario);
        this.corSolicitada = corSolicitada;
    }

    public String getCorSolicitada() {
        return corSolicitada;
    }

    public void setCorSolicitada(String corSolicitada) {
        this.corSolicitada = corSolicitada;
    }

    @Override
    public void imprimirDetalhado() {
        
        super.imprimirDetalhado();
        System.out.println("Cor solicitada: " + corSolicitada);
    }
}