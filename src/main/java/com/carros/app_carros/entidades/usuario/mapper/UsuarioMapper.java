package com.carros.app_carros.entidades.usuario.mapper;

import com.carros.app_carros.entidades.enums.TipoAssinatura;
import com.carros.app_carros.entidades.usuario.Usuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapper implements RowMapper<Usuario> {
    @Override
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        String login = rs.getString("login");
        String password = rs.getString("password");
        String email = rs.getString("email");
        Blob imagem = rs.getBlob("imagem");
        TipoAssinatura assinatura = TipoAssinatura.getTipoAssinatura(rs.getInt("tipo_assinatura"));
        return new Usuario(login, password, imagem, assinatura, email);
    }
}
