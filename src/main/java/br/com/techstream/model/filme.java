package br.com.techstream.model;

public class Filme extends Conteudo {

    private String diretor;

    public Filme(String titulo, int duracaoMinutos, String genero
    String diretor){
        super(titulo, duracaoMinutos, genero);
        this.diretor = diretor;
    }

    public String getDiretor(){
        return diretor;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Diretor: " + diretor);
    }
}