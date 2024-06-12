package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    // Set evita o coplamento, já que está acima do LinkedHasSet
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    /* a medida que forem inseridos, serão salvos obedecendo
    a ordem de inserção.Também só admite um curso (sem repetir) */
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    /* pela herança, podemos trabalhar com cursos e mentorias */
    
    public void inscreverBootcamp(Bootcamp bootcamp){

    }

    public void progredir(){

    }

    public void calcularTotalXp(){

    }
}
