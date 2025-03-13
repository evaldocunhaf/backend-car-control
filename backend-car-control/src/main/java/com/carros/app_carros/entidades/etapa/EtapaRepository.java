package com.carros.app_carros.entidades.etapa;

import java.util.List;

public interface EtapaRepository {
    List<Etapa> listarEtapas();
    Etapa buscarEtapaPorId(Integer id);
}
