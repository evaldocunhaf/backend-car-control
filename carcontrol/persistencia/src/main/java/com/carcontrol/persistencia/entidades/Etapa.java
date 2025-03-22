package com.carcontrol.persistencia.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Etapa {
    @Id
    private Long id;
    private String titulo;
    private String descricao;

    public Etapa(Long id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Etapa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
