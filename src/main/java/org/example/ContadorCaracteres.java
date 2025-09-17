package org.example;

public class ContadorCaracteres {

    public int contar(String texto, char letra){
        int contador =0;
        texto = texto.toLowerCase();

        for(int i=0; i< texto.length(); i++){
            if(texto.charAt(i) == letra){
                contador++;
            }
        }

        return contador;
    }
}
