package br.com.fescfafic.autenticacao.Model;

public class Usuario {
    protected String nome;
    protected String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    public void autenticar(String nome, String senha) {
        if (nome.isEmpty()) {
            throw new NomeUsuarioInvalidoException();
        } else if (senha.length() < 6) {
            throw new SenhaMuitoCurtaException();
        } else if (this.nome.equals(nome) && this.senha.equals(senha)) {
            System.out.println("Usuario autenticado com sucesso.");
        } else {
            throw new AutenticacaoException();
        }
    }
}
