package com.carcontrol.persistencia.mapper;

import com.carros.app_carros.entidades.etapa.Etapa;
import com.carros.app_carros.entidades.etapa.EtapaRepository;
import com.carros.app_carros.entidades.etapa.mapper.EtapaMapper;
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
