package org.example;

import java.util.regex.Pattern;

public class ValidadorSenha {

    public boolean validar(String senha){
        boolean senhaValida = true;

        if(!Pattern.compile("\\d").matcher(senha).find() ||
                !Pattern.compile("[A-Z]").matcher(senha).find() ||
                senha.length() < 8
        ){
            senhaValida = false;
        }

        return senhaValida;
    }
}
