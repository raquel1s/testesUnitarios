package org.example;

public class ConversorMoeda {

    public double realParaDolar(double valor, double cotacao){
        if(valor < 0 || cotacao <= 0){
            throw new RuntimeException();
        }

        return valor*cotacao;
    }
}
