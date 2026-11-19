package Sistema1;

import java.time.LocalDateTime;

public abstract class Manutencao implements Imprimivel, Identificavel {
    long codigo;
    String descricao;
    LocalDateTime dataSolicitacao;
    Morador morador;
    Funcionario funcionario;

    public Manutencao() {
    }

    public Manutencao(long codigo, String descricao, LocalDateTime dataSolicitacao, Morador morador, Funcionario funcionario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataSolicitacao = dataSolicitacao;
        this.morador = morador;
        this.funcionario = funcionario;
    }

    @Override
    public long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public void imprimirDetalhado() {
        System.out.println("Código: " + codigo + " | Descrição: " + descricao + " | Data: " + dataSolicitacao);
        if (morador != null) {
            System.out.println("Solicitante: " + morador.getNome() + " (Apto " + morador.getApartamento() + ")");
        }
        if (funcionario != null) {
            System.out.println("Responsável Técnico: " + funcionario.getNome() + " (" + funcionario.getEspecialidade() + ")");
        }
    }
}