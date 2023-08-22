package com.mycompany.luccaleonardoado1;

/**
 *
 * @author Lucca
 */
public class SobreLontra {
    
    //Atributos
    private String alimentacao;
    private String cor;
    private String curiosidade;
    private String especie;
    private double tamanho;
    
    public SobreLontra () {
        
    }
    
    public SobreLontra(String especie, String alimentacao, String cor, double tamanho, String curiosidade) {
        this.especie = especie;
        this.alimentacao = alimentacao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.curiosidade = curiosidade;
    }

    //Meu animal faz...
    public void nadar() {
        System.out.println("A lontra nada muito rápido!");
    }
    
    public void reproducao(){
        System.out.println("A maioria das vezes as lontras tem filhotes gêmeos!");
    }
    
    //Getters and Setters
    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }  
}
