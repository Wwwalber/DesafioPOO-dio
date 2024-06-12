package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Cursos Java");
        curso1.setDescricao("Descrição do curso de Java.");
        curso1.setCargaHoraria(8);    
        System.out.println(curso1);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de Java.");
        curso2.setCargaHoraria(8);  
        System.out.println(curso2);

        Conteudo conteudo = new Curso();/* com polimorfismo posso instanciar
                                    Conteudo mais a partir de curso */

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("mentoria de java com Spring Boot");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

    }
}
