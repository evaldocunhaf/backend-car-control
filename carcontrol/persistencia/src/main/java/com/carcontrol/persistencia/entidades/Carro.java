package com.carcontrol.persistencia.entidades;

import java.sql.Blob;

import com.carcontrol.persistencia.entidades.Etapa;
import com.carcontrol.persistencia.entidades.Usuario;

public class Carro {
    private String placa;
    private String modelo;
    private String cor;
    private String cidade;
    private Blob foto;
    private Usuario usuario;
    private Etapa etapa;

    public Carro(String placa, String modelo, String cor, String cidade, Blob foto, Usuario usuario, Etapa etapa) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.cidade = cidade;
        this.foto = foto;
        this.usuario = usuario;
        this.etapa = etapa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }
}
