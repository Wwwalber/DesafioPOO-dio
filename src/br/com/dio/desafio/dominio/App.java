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

        /* instanciar um bootcamp */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        /* instanciar dois devs */
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila "+devCamila.getConteudosInscritos());

        devCamila.progredir();// concluiu um conteúdo
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());

                System.out.println("----------");

        Dev devWalber = new Dev();
        devWalber.setNome("Walber");
        devWalber.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Walber "+devWalber.getConteudosInscritos());
        devWalber.progredir();
        devWalber.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Walber "+devWalber.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Walber "+devWalber.getConteudosConcluidos());
        System.out.println("XP: "+ devWalber.calcularTotalXp());
        
            System.out.println("----------");
        Bootcamp bootcamp3 = new Bootcamp();
        bootcamp3.cadastrarBootcamp();

    }
}
