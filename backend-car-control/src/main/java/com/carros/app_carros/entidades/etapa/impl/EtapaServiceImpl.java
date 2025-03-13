package com.carros.app_carros.entidades.etapa.impl;

import com.carros.app_carros.entidades.etapa.Etapa;
import com.carros.app_carros.entidades.etapa.EtapaRepository;
import com.carros.app_carros.entidades.etapa.EtapaService;
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
        return etapaRepository.listarEtapas();
    }

    @Override
    public Etapa buscarEtapaPorId(Integer id) {
        return etapaRepository.buscarEtapaPorId(id);
    }
}
