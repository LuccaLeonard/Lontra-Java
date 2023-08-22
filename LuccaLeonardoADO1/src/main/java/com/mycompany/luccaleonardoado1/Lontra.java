package com.mycompany.luccaleonardoado1;

public class Lontra {

    public static void main(String[] args) {
        SobreLontra lont1 = new SobreLontra();
        
        lont1.setAlimentacao("Carne");
        lont1.setCor("Marrom");
        lont1.setCuriosidade("Os filhotes nascem cegos e só abrem os olhos a partir da quarta semana após o nascimento");
        lont1.setTamanho(1.5);
        lont1.setNome("Ariranha");
        
        //criando 2º objeto
        SobreLontra lont2 = new SobreLontra ("Lontra", "Peixes", "Preta", 1.45,"Precisam se pentear para nadar melhor");
        
        System.out.println(lont1.getNome());
        System.out.println(lont2.getNome());
    } 
}
