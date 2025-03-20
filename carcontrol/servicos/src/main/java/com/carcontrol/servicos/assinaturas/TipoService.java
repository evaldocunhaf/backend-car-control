package com.carcontrol.servicos.assinaturas;

import java.util.List;

public interface TipoService {
    List<Tipo> listarTipos();
    Tipo buscarTipoPorId(Long id);
}
