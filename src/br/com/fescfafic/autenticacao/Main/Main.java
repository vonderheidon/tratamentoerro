package br.com.fescfafic.autenticacao.Main;

import br.com.fescfafic.autenticacao.Model.AutenticacaoException;
import br.com.fescfafic.autenticacao.Model.NomeUsuarioInvalidoException;
import br.com.fescfafic.autenticacao.Model.SenhaMuitoCurtaException;
import br.com.fescfafic.autenticacao.Model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("teste", "123456");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do usuario: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        try {
            usuario.autenticar(nome, senha);
        } catch (NomeUsuarioInvalidoException | AutenticacaoException | SenhaMuitoCurtaException e) {
            System.err.println(e);
        }
    }
}