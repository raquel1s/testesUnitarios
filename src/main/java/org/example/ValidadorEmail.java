package org.example;

import java.util.regex.Pattern;

public class ValidadorEmail {

    public boolean validar(String email){
        return Pattern.compile(".+@.+\\\\.[a-z]+")
                .matcher(email)
                .matches();
    }
}
