package com.carcontrol.servicos.assinaturas;

import java.util.List;

import com.carcontrol.persistencia.entidades.Etapa;

public interface EtapaService {
    List<Etapa> listarEtapas();
    Etapa buscarEtapaPorId(Integer id);
}
