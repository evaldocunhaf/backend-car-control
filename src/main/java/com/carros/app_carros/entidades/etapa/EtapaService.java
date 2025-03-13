package com.carros.app_carros.entidades.etapa;

import java.util.List;

public interface EtapaService {
    List<Etapa> listarEtapas();
    Etapa buscarEtapaPorId(Integer id);
}
