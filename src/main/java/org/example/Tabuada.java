package org.example;

import java.util.ArrayList;

public class Tabuada {

    public int[] gerarTabuada(int num){
        int[] tabuada = new int[10];

        for(int i=0; i<10; i++){
            tabuada[i] = num * (i+1);
        }

        return tabuada;
    }
}
