package com.carcontrol.servicos.impl;

import com.carcontrol.persistencia.entidades.Tipo;
import com.carcontrol.persistencia.repositorios.TipoRepository;
import com.carcontrol.servicos.assinaturas.TipoService;

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
        return tipoRepository.findAll();
    }

    @Override
    public Tipo buscarTipoPorId(Long id) {
        return tipoRepository.findById(id).orElse(null);
    }
}
