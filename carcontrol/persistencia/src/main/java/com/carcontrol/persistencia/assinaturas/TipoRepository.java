package com.carcontrol.persistencia.assinaturas;

import java.util.List;

public interface TipoRepository {
    List<Tipo> listarTipos();
    Tipo buscarTipoPorId(Long id);
}
