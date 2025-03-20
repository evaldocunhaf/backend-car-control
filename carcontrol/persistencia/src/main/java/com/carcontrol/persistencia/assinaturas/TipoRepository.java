package com.carcontrol.persistencia.assinaturas;

import java.util.List;

import com.carcontrol.persistencia.entidades.Tipo;

public interface TipoRepository {
    List<Tipo> listarTipos();
    Tipo buscarTipoPorId(Long id);
}
