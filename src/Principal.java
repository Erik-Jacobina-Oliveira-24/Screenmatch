import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Filme meuFilme = new Filme();
        Filme outroFilme = new Filme();
        Serie serie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        double notaFilme = 0;
        double notaSerie = 0;

        System.out.println("Digite o nome do filme: ");
        meuFilme.setNome(leitor.nextLine());
        System.out.println("Digite o ano de lançamento do filme: ");
        meuFilme.setAnoDeLancamento(leitor.nextInt());
        System.out.println("Digite a duração do filme (em minuots): ");
        meuFilme.setDuracaoEmMinutos(leitor.nextInt());

        System.out.println("Digite o nome do filme: ");
        outroFilme.setNome(leitor.nextLine());
        System.out.println("Digite o ano de lançamento do filme: ");
        outroFilme.setAnoDeLancamento(leitor.nextInt());
        System.out.println("Digite a duração do filme (em minuots): ");
        outroFilme.setDuracaoEmMinutos(leitor.nextInt());

        /*System.out.println("Quantas pessoas vão avaliar o filme? ");
        int quantidade = leitor.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite sua avaliação do filme: ");
            notaFilme = leitor.nextDouble();
            meuFilme.avalia(notaFilme);
        }

        meuFilme.exibeFichaTecnica();
        System.out.println("Quantidade de avaliação do filme: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(String.format("A média do filme é %.2f", meuFilme.pegaMedia()));*/

        System.out.println("Digite o nome da série: ");
        serie.setNome(leitor.nextLine());
        System.out.println("Digite o ano de lançamento da serie: ");
        serie.setAnoDeLancamento(leitor.nextInt());
        System.out.println("Quantidades de temporada: ");
        serie.setTemporadas(leitor.nextInt());
        System.out.println("Quantidade de episodio por temporada: ");
        serie.setEpisodioPorTemporada(leitor.nextInt());
        System.out.println("Quantos minutos tem por episodio: ");
        serie.setMinutosPorEpisodio(leitor.nextInt());
        System.out.println(String.format("Duração para maratonar %s: %d", serie.getNome(), serie.getDuracaoEmMinutos()));
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

    }
}
