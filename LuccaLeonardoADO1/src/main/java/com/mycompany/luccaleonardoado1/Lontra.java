package com.mycompany.luccaleonardoado1;

public class Lontra {

    public static void main(String[] args) {
        SobreLontra lont1 = new SobreLontra();
        
        lont1.setAlimentacao("Carne");
        lont1.setCor("Marrom");
        lont1.setCuriosidade("Os filhotes nascem cegos e só abrem os olhos a partir da quarta semana após o nascimento");
        lont1.setTamanho(1.5);
        lont1.setEspecie("Ariranha");
        
        SobreLontra lont2 = new SobreLontra ();
        
        lont2.setTamanho(1.45);
        System.out.println(lont2.getTamanho());
    } 
}
