/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public SobreLontra(String especie, String alimentacao, String cor, String curiosidade, double tamanho) {
        this.especie = especie;
        this.alimentacao = alimentacao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.curiosidade = curiosidade;
    }

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
