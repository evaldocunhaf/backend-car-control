package com.carcontrol.servicos.impl;

import com.carcontrol.persistencia.entidades.Etapa;
import com.carcontrol.persistencia.repositorios.EtapaRepository;

import com.carcontrol.servicos.assinaturas.EtapaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtapaServiceImpl implements EtapaService {

    private EtapaRepository etapaRepository;

    public EtapaServiceImpl(EtapaRepository etapaRepository) {
        this.etapaRepository = etapaRepository;
    }

    @Override
    public List<Etapa> listarEtapas() {
        return etapaRepository.findAll();
    }

    @Override
    public Etapa buscarEtapaPorId(Integer id) {
        return etapaRepository.findById(id).orElse(null);
    }
}
