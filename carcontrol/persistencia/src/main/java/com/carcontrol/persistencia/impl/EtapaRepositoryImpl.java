package com.carcontrol.persistencia.impl;

import com.carcontrol.persistencia.assinaturas.EtapaRepository;
import com.carcontrol.persistencia.entidades.Etapa;
import com.carcontrol.persistencia.mapper.EtapaMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EtapaRepositoryImpl implements EtapaRepository {


    private final JdbcTemplate jdbcTemplate;

    public EtapaRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Etapa> listarEtapas() {
        String sql = "SELECT * FROM Etapa";
        return jdbcTemplate.query(sql, new EtapaMapper());
    }

    @Override
    public Etapa buscarEtapaPorId(Integer id) {
        String sql = "SELECT * FROM Etapa WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new EtapaMapper(), id);
    }
}
