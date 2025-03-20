package com.carcontrol.servicos.assinaturas;

import java.util.List;

import com.carcontrol.persistencia.entidades.Tipo;

public interface TipoService {
    List<Tipo> listarTipos();
    Tipo buscarTipoPorId(Long id);
}
