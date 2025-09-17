package org.example;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valor, double percentual){
        if(percentual > 100){
            throw new RuntimeException();
        }

        return valor * (1 - (percentual/100));
    }
}
