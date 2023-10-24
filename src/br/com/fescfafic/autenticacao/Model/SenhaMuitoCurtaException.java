package br.com.fescfafic.autenticacao.Model;

public class SenhaMuitoCurtaException extends RuntimeException {
    public SenhaMuitoCurtaException() {
        super("A senha deve ter no minimo 6 caracteres.");
    }
}
