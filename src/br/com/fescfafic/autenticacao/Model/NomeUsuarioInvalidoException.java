package br.com.fescfafic.autenticacao.Model;

public class NomeUsuarioInvalidoException extends RuntimeException {
    public NomeUsuarioInvalidoException() {
        super("Esse nome de usuario eh invalido.");
    }
}
