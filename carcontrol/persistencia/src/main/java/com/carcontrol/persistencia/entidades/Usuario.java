package com.carcontrol.persistencia.entidades;

import com.carcontrol.persistencia.enums.TipoAssinatura;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.sql.Blob;

@Entity
public class Usuario {
    @Id
    private String cpf;
    private String login;
    private String password;
    @Lob
    private byte[] imagem;
    private TipoAssinatura tipoAssinatura;
    private String email;

    public Usuario() {}

    public Usuario(String cpf, String login, String password, byte[] imagem, TipoAssinatura tipoAssinatura, String email) {
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
}
