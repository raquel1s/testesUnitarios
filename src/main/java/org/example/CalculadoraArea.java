package org.example;

public class CalculadoraArea {

    public double areaQuadrado(double lado){
        return lado*lado;
    }

    public double areaRetangulo(double base, double altura){
        return base*altura;
    }

    public double areaCirculo(double raio){
        return 3.14*(raio*raio);
    }
}
