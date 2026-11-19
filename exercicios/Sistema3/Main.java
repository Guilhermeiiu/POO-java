package Sistema3;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Criando produtos audiovisuais
        Filme filme = new Filme(101L, "Oppenheimer", 2023, "Christopher Nolan", 180, true);
        filme.adicionarAtor("Cillian Murphy");
        filme.adicionarAtor("Emily Blunt");
        filme.adicionarAtor("Robert Downey Jr.");

        Serie serie = new Serie(102L, "Severance", 2022, "Ben Stiller", 2);
        serie.adicionarAtor("Adam Scott");
        serie.adicionarAtor("Britt Lower");

        Documentario doc = new Documentario(103L, "Free Solo", 2018, "Elizabeth Chai Vasarhelyi", 100, true);
        
        // 2. Criando avaliações
        Avaliacao av1 = new Avaliacao(1L, new Date(), filme, "Obra-prima! Fotografia e trilha sonora impecáveis.");
        Avaliacao av2 = new Avaliacao(2L, new Date(), serie, "Roteiro envolvente e final de temporada tenso.");
        Avaliacao av3 = new Avaliacao(3L, new Date(), doc, "De tirar o fôlego do início ao fim.");

        // 3. Criando usuário e vinculando avaliações
        Usuario usuario = new Usuario(1L, "Guilherme");
        usuario.adicionarAvaliacao(av1);
        usuario.adicionarAvaliacao(av2);
        usuario.adicionarAvaliacao(av3);

        // 4. Exibindo todas as avaliações do usuário
        usuario.imprimirAvaliacoes();

        // 5. Testando alterações e remoção
        av2.alterarAvaliacao("Melhor série de ficção científica recente! Nota 10.");
        usuario.removerAvaliacao(av3);

        System.out.println("--- APÓS ATUALIZAÇÃO ---\n");
        usuario.imprimirAvaliacoes();
    }
}
