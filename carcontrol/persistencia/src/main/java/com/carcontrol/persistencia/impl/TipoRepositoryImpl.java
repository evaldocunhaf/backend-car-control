package com.carcontrol.persistencia.impl;

import com.carcontrol.persistencia.entidades.Tipo;
import com.carcontrol.persistencia.assinaturas.TipoRepository;
import com.carcontrol.persistencia.mapper.TipoMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TipoRepositoryImpl implements TipoRepository {

    private JdbcTemplate jdbcTemplate;

    public TipoRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Tipo> listarTipos() {
        String sql = "select * from tipo";
        return jdbcTemplate.query(sql, new TipoMapper());
    }

    @Override
    public Tipo buscarTipoPorId(Long id) {
        String sql = "select * from tipo where id = ?";
        return jdbcTemplate.queryForObject(sql, new TipoMapper());
    }
}
