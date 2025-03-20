package com.carcontrol.servicos.exceptions;

public class NomeDeUsuarioJaCadastradoException extends RuntimeException {
    public NomeDeUsuarioJaCadastradoException(String message) {
        super(message);
    }
}
