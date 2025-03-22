package com.carcontrol.persistencia.entidades;

import java.sql.Blob;

import com.carcontrol.persistencia.entidades.Etapa;
import com.carcontrol.persistencia.entidades.Usuario;
import com.carcontrol.persistencia.entidades.id.CarroId;
import jakarta.persistence.*;

@Entity
public class Carro {
    @EmbeddedId
    private CarroId carroId;
    private String modelo;
    private String cor;
    private String cidade;
    @Lob
    private byte[] foto;
    @ManyToOne
    @MapsId("cpf")
    @JoinColumn(name = "cpf",  insertable = false, updatable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id")
    private Etapa etapa;

    public Carro() {}

    public Carro(String placa, String modelo, String cor, String cidade, byte[] foto, Usuario usuario, Etapa etapa) {
        this.carroId = new CarroId(placa, usuario.getCpf());
        this.modelo = modelo;
        this.cor = cor;
        this.cidade = cidade;
        this.foto = foto;
        this.usuario = usuario;
        this.etapa = etapa;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public void setCarroId(CarroId carroId) {
        this.carroId = carroId;
    }

    public String getPlaca() {
        return carroId.getPlaca();
    }

    public void setPlaca(String placa) {
        carroId.setPlaca(placa);
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
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
