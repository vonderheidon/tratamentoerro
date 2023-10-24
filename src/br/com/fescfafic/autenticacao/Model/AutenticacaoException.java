package br.com.fescfafic.autenticacao.Model;

public class AutenticacaoException extends RuntimeException {
    public AutenticacaoException() {
        super("Usuario e/ou senha incorretos.");
    }
}
