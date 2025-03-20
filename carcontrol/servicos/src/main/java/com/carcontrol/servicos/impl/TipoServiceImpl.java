package com.carcontrol.servicos.impl;

import com.carros.app_carros.entidades.tipo.Tipo;
import com.carros.app_carros.entidades.tipo.TipoRepository;
import com.carros.app_carros.entidades.tipo.TipoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoServiceImpl implements TipoService {

    private TipoRepository tipoRepository;

    public TipoServiceImpl(TipoRepository tipoRepository) {
        this.tipoRepository = tipoRepository;
    }

    @Override
    public List<Tipo> listarTipos() {
        return tipoRepository.listarTipos();
    }

    @Override
    public Tipo buscarTipoPorId(Long id) {
        return tipoRepository.buscarTipoPorId(id);
    }
}
