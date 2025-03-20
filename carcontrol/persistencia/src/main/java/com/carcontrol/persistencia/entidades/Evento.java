package com.carcontrol.persistencia.entidades;

import com.carcontrol.persistencia.entidades.Etapa;
import com.carcontrol.persistencia.entidades.Carro;
import com.carcontrol.persistencia.entidades.Tipo;

import java.util.Date;

public class Evento {
    private Date data;
    private String titulo;
    private String descricao;
    private Carro carro;
    private Etapa etapa;
    private Tipo tipo;
}
