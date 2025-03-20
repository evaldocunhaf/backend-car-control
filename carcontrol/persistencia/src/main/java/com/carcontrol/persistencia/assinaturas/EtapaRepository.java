package com.carcontrol.persistencia.assinaturas;

import java.util.List;

public interface EtapaRepository {
    List<Etapa> listarEtapas();
    Etapa buscarEtapaPorId(Integer id);
}
