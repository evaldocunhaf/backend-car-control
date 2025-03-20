package com.carcontrol.persistencia.assinaturas;

import java.util.List;
import com.carcontrol.persistencia.entidades.Etapa;

public interface EtapaRepository {
    List<Etapa> listarEtapas();
    Etapa buscarEtapaPorId(Integer id);
}
