package br.com.dio.desafio.dominio;

import java.util.Scanner;
import java.util.function.Consumer;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }   
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + 
        ", \ndescricao=" + getDescricao() + 
        ", \ncargaHoraria=" + cargaHoraria + "]";
    }
    @Override
    public void cadastrarConteudo() {
        try (Scanner scanner = new Scanner(System.in)) {
            Consumer<String> leitorInput = campo -> {
                System.out.println("Dê " + campo + " para o curso");
                if ("um titulo".equals(campo)) {
                    System.out.println("Aguardando entrada para título...");
                    if (scanner.hasNextLine()) {
                        this.titulo = scanner.nextLine();
                        System.out.println("Título capturado: " + this.titulo);
                    } else {
                        System.err.println("Nenhuma linha encontrada para o título.");
                    }
                } else if ("uma descrição".equals(campo)) {
                    System.out.println("Aguardando entrada para descrição...");
                    if (scanner.hasNextLine()) {
                        this.descricao = scanner.nextLine();
                        System.out.println("Descrição capturada: " + this.descricao);
                    } else {
                        System.err.println("Nenhuma linha encontrada para a descrição.");
                    }
                }
            };

            leitorInput.accept("um titulo");
            leitorInput.accept("uma descrição");

            if (this.titulo != null && this.descricao != null) {
                System.out.println("Conteúdo " + this.titulo + " cadastrado com sucesso!\n" + this.descricao);
            } else {
                System.err.println("Falha ao capturar título ou descrição.");
            }
        }
    }
    

}
