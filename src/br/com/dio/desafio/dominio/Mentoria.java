package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }
        
    @Override
    public double calcularXp() {
        return XP_PADRAO + 200;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + 
        ", \ndescricao=" + getDescricao() + ", \ndata=" +
         data + "]";
    }

    @Override
    public void cadastrarConteudo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarConteudo'");
    }
}
