package com.carcontrol.persistencia.entidades;

import com.carros.app_carros.entidades.carro.Carro;
import com.carros.app_carros.entidades.etapa.Etapa;

import java.util.Date;

public class Evento {
    private Date data;
    private String titulo;
    private String descricao;
    private Carro carro;
    private Etapa etapa;
    private Tipo tipo;
}
