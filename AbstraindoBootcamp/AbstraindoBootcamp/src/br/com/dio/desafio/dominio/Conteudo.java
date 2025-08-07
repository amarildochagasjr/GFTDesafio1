package br.com.dio.desafio.dominio;

public sealed abstract class Conteudo permits Curso, Mentoria {

    protected static final double XP_PADRAO = 25d;
    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Informacoes{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + "', ";
    }

    public abstract double calcularXp();
}
