package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // constante
    protected static final double XP_PADRAO = 10;
    /* static - posso acessar fora da classe 
     * protected - filhos de conteúdo terão acesso
    */
    protected String titulo;
    protected String descricao;

    /* obrigar os filhos a implementar */
    public abstract double calcularXp();/*  
                causa de a classe ter de ser abstrata
                não pode ser instanciada */

    public abstract void cadastrarConteudo();

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
    
}
