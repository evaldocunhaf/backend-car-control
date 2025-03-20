package com.carcontrol.servicos.assinaturas;

import java.util.List;

public interface EtapaService {
    List<Etapa> listarEtapas();
    Etapa buscarEtapaPorId(Integer id);
}
