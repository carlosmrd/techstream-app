package br.com.techstream;

public abstract class Conteudo {

    protected String titulo;
    protected String genero;
    protected int duracaoMinutos;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getDuracaoMinutos() { return duracaoMinutos; }
    public void setDuracaoMinutos(int duracaoMinutos) { this.duracaoMinutos = duracaoMinutos; }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + " | Gênero: " + genero + " | Duração: " + duracaoMinutos + " min");
    }
}