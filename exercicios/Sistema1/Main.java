package Sistema1;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        CentralManutencao central = new CentralManutencao();

        
        Morador morador1 = new Morador("Ana Clara", "(61) 99999-1111", "101-A", true);
        Morador morador2 = new Morador("Guilherme Correia", "(61) 98888-2222", "304-B", false);

        Funcionario funcEletrica = new Funcionario("Roberto Silva", "(61) 97777-3333", "Eletricista", 8);
        Funcionario funcHidraulica = new Funcionario("Marcos Souza", "(61) 96666-4444", "Encanador", 5);
        Funcionario funcPintura = new Funcionario("Juliana Alves", "(61) 95555-5555", "Pintora", 4);

        // polimorfismo com a interface Imprimivel em Pessoa
        System.out.println("CADASTRO DE PESSOAS");
        Imprimivel[] pessoas = { morador1, morador2, funcEletrica };
        for (Imprimivel p : pessoas) {
            p.imprimirDetalhado();
            System.out.println();
        }

        // criando solicitações de manutenção
        Manutencao m1 = new Eletrica(101L, "Curto circuito na tv", LocalDateTime.now(), morador1, funcEletrica, true);
        Manutencao m2 = new Hidraulica(102L, "Vazamento na pia da cozinha", LocalDateTime.now().minusHours(2), morador2, funcHidraulica, true);
        Manutencao m3 = new Pintura(103L, "Pintura da parede da sala", LocalDateTime.now().minusDays(1), morador1, funcPintura, "Branco Gelo");

        // adicionando na Central de solicitacoes
        System.out.println("REGISTRANDO SOLICITAÇÕES");
        central.adicionarSolicitacao(m1);
        central.adicionarSolicitacao(m2);
        central.adicionarSolicitacao(m3);

        // imprimindo todas as solicitações
        central.imprimirSolicitacoes();

        // buscando por morador
        System.out.println("BUSCA POR MORADOR");
        try {
            Manutencao resultado = central.buscarPorMorador("Carlos Eduardo");
            System.out.println("Solicitação encontrada:");
            resultado.imprimirDetalhado();
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // cancelando uma solicitação existente
        System.out.println("\nCANCELAMENTO DE SOLICITAÇÃO");
        try {
            central.cancelarSolicitacao(102L);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        central.imprimirSolicitacoes();

        // tratamento de erros
        System.out.println("TESTES DE TRATAMENTO DE ERROS");
        
        // teste 1- cancelar código que não existe
        try {
            central.cancelarSolicitacao(999L);
        } catch (NoSuchElementException e) {
            System.out.println("[Exceção capturada] " + e.getMessage());
        }

        // teste 2- buscar morador sem solicitação
        try {
            central.buscarPorMorador("João Ninguém");
        } catch (NoSuchElementException e) {
            System.out.println("[Exceção capturada] " + e.getMessage());
        }

        // teste 3- adicionar solicitação inválida (nula)
        try {
            central.adicionarSolicitacao(null);
        } catch (IllegalArgumentException e) {
            System.out.println("[Exceção capturada] " + e.getMessage());
        }
    }
}