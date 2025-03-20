package com.carcontrol.persistencia.impl;

import com.carros.app_carros.entidades.tipo.Tipo;
import com.carros.app_carros.entidades.tipo.TipoRepository;
import com.carros.app_carros.entidades.tipo.mapper.TipoMapper;
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
