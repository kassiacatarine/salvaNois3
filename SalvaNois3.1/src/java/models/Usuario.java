/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author kassia
 */
public class Usuario {
    private int id;
    private String login;
    private String senha;
    private String email;
    private String endereco;
    private String nome;
    private boolean admin;

    public Usuario(int id, String login, String senha, String email, String endereco, String nome, boolean isAdmin) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.admin = isAdmin;
    }

    public Usuario(String login, String senha, String email, String endereco, String nome, boolean isAdmin) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.admin = isAdmin;
    }

    public Usuario() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}