package com.carros.app_carros.entidades.usuario;

import com.carros.app_carros.entidades.enums.TipoAssinatura;

import java.sql.Blob;

public class Usuario {
    private String login;
    private String password;
    private Blob imagem;
    private TipoAssinatura tipoAssinatura;
    private String email;

    public Usuario(String login, String password, Blob imagem, TipoAssinatura tipoAssinatura, String email) {
        this.login = login;
        this.password = password;
        this.imagem = imagem;
        this.tipoAssinatura = tipoAssinatura;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Blob getImagem() {
        return imagem;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }

    public TipoAssinatura getTipoAssinatura() {
        return tipoAssinatura;
    }

    public void setTipoAssinatura(TipoAssinatura tipoAssinatura) {
        this.tipoAssinatura = tipoAssinatura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
