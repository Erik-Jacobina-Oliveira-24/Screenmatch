package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private  double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() { //Get -> metedo acessor (Metedo para acessar) Pegar valor
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {  //set -> atribuir valores / usar alt + insert
        this.nome = nome;               //“this” se refere ao objeto atual e não ao parâmetro do metodo
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() { //Void não retorna valor, mas sim executa a ação de mostrar o resultado
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos);

    }

    public void avalia(double nota){ //Dentro dos () é um argumento que será utilizado
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){ //Realiza o calulo e retorna o resultado
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
