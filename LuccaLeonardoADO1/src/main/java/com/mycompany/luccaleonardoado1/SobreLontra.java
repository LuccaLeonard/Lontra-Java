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
    private String nome;
    private double tamanho;
    
    //Construtor Vazio
    public SobreLontra () {
        
    }
    
    public SobreLontra(String nome, String alimentacao, String cor, double tamanho, String curiosidade) {
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }  
}
