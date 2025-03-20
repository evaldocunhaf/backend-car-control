package com.carcontrol.persistencia.mapper;

import com.carcontrol.persistencia.entidades.Etapa;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EtapaMapper implements RowMapper<Etapa> {
    @Override
    public Etapa mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long id = rs.getLong("id");
        String descricao = rs.getString("descricao");
        String titulo = rs.getString("título");
        return new Etapa(id, titulo, descricao);
    }
}
