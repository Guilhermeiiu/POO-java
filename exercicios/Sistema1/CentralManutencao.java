package Sistema1;

import java.util.NoSuchElementException;
public class CentralManutencao {
    private ListaSolicitacoes lista;

    public CentralManutencao() {
        this.lista = new ListaSolicitacoes();
    }

    public void adicionarSolicitacao(Manutencao manutencao) {
        if (manutencao == null) {
            throw new IllegalArgumentException("Erro: Não é possível adicionar uma manutenção nula.");
        }
        if (manutencao.getCodigo() <= 0) {
            throw new IllegalArgumentException("Erro: O código da manutenção deve ser maior que zero.");
        }
        if (manutencao.getMorador() == null) {
            throw new IllegalArgumentException("Erro: A solicitação deve estar vinculada a um morador.");
        }

        lista.adicionar(manutencao);
        System.out.println("Solicitação #" + manutencao.getCodigo() + " adicionada com sucesso!");
    }

    public void cancelarSolicitacao(long codigo) {
        boolean removida = lista.removerPorCodigo(codigo);
        if (!removida) {
            throw new NoSuchElementException("Erro ao cancelar: Nenhuma solicitação encontrada com o código " + codigo + ".");
        }
        System.out.println("Solicitação #" + codigo + " cancelada e removida com sucesso.");
    }

    public Manutencao buscarPorMorador(String nomeMorador) {
        if (nomeMorador == null || nomeMorador.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O nome do morador para busca não pode ser vazio.");
        }

        Manutencao encontrada = lista.buscarPorMorador(nomeMorador);
        if (encontrada == null) {
            throw new NoSuchElementException("Nenhuma solicitação encontrada para o morador: " + nomeMorador);
        }
        return encontrada;
    }
    public void imprimirSolicitacoes() {
        System.out.println("\n=== SOLICITAÇÕES REGISTRADAS (Total: " + lista.tamanho() + ") ===");
        lista.imprimirTodas();
    }
}