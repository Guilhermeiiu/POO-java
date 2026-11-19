package Sistema1;

import java.time.LocalDateTime;

public class Hidraulica extends Manutencao {
    boolean vazamentoAtivo;

    public Hidraulica(long codigo, String descricao, LocalDateTime dataSolicitacao, Morador morador, Funcionario funcionario, boolean vazamentoAtivo) {
        super(codigo, descricao, dataSolicitacao, morador, funcionario);
        this.vazamentoAtivo = vazamentoAtivo;
    }

    public boolean getVazamentoAtivo() {
        return vazamentoAtivo;
    }

    public void setVazamentoAtivo(boolean vazamentoAtivo) {
        this.vazamentoAtivo = vazamentoAtivo;
    }

    @Override
    public void imprimirDetalhado() {
        super.imprimirDetalhado();
        System.out.println("\nVazamento ativo: " + (vazamentoAtivo ? "Sim" : "Não"));
    }
}