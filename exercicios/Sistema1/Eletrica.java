package Sistema1;

import java.time.LocalDateTime;

public class Eletrica extends Manutencao {
    boolean precisaDesligamentoGeral;

    public Eletrica(long codigo, String descricao, LocalDateTime dataSolicitacao, Morador morador, Funcionario funcionario, boolean precisaDesligamentoGeral) {
        super(codigo, descricao, dataSolicitacao, morador, funcionario);
        this.precisaDesligamentoGeral = precisaDesligamentoGeral;
    }

    public boolean getPrecisaDesligamentoGeral() {
        return precisaDesligamentoGeral;
    }

    public void setPrecisaDesligamentoGeral(boolean precisaDesligamentoGeral) {
        this.precisaDesligamentoGeral = precisaDesligamentoGeral;
    }

    @Override
    public void imprimirDetalhado() {
        super.imprimirDetalhado();
        if (precisaDesligamentoGeral==true) {
        System.out.println("\nPrecisa de desligamento geral: " + "Sim");
        	}
        else {
        	System.out.println("\nPrecisa de desligamento geral: " + "Não");
        }
    }
}