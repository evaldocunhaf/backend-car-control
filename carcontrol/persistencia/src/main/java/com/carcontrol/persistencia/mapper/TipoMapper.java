package com.carcontrol.persistencia.mapper;

import com.carros.app_carros.entidades.tipo.Tipo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoMapper implements RowMapper<Tipo> {

    @Override
    public Tipo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long id = rs.getLong("id");
        String titulo = rs.getString("titulo");
    return new Tipo(id, titulo);
    }
}
