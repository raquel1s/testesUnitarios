package org.example;

public class CalculadoraMedia {

    public double calcularMedia(int[] numeros){
        double media = 0;

        for(int i=0; i<numeros.length; i++){
            media += numeros[i];
        }

        return media/numeros.length;
    }
}
