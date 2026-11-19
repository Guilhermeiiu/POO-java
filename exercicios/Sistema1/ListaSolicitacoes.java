package Sistema1;

public class ListaSolicitacoes {
    private NoSolicitacao inicio;

    public ListaSolicitacoes() {
        this.inicio = null;
    }

    public void adicionar(Manutencao manutencao) {
        if (manutencao == null) {
            throw new IllegalArgumentException("A solicitação de manutenção não pode ser nula.");
        }

        NoSolicitacao novoNo = new NoSolicitacao(manutencao);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            NoSolicitacao atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    public boolean removerPorCodigo(long codigo) {
        if (inicio == null) {
            return false;
        }

        // Caso o elemento a ser removido seja o primeiro da lista
        if (inicio.getManutencao().getCodigo() == codigo) {
            inicio = inicio.getProximo();
            return true;
        }

        NoSolicitacao anterior = inicio;
        NoSolicitacao atual = inicio.getProximo();

        while (atual != null) {
            if (atual.getManutencao().getCodigo() == codigo) {
                anterior.setProximo(atual.getProximo());
                return true;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

        return false;
    }

    public Manutencao buscarPorMorador(String nomeMorador) {
        if (nomeMorador == null || nomeMorador.trim().isEmpty()) {
            return null;
        }

        NoSolicitacao atual = inicio;
        while (atual != null) {
            Manutencao m = atual.getManutencao();
            if (m.getMorador() != null && m.getMorador().getNome().equalsIgnoreCase(nomeMorador.trim())) {
                return m;
            }
            atual = atual.getProximo();
        }

        return null;
    }

    public void imprimirTodas() {
        if (inicio == null) {
            System.out.println("Nenhuma solicitação registrada na lista.");
            return;
        }

        NoSolicitacao atual = inicio;
        while (atual != null) {
            // Chamada polimórfica: executa o imprimirDetalhado() da subclasse específica
            atual.getManutencao().imprimirDetalhado();
            System.out.println("----------------------------------------");
            atual = atual.getProximo();
        }
    }

    public int tamanho() {
        int contador = 0;
        NoSolicitacao atual = inicio;
        while (atual != null) {
            contador++;
            atual = atual.getProximo();
        }
        return contador;
    }
}