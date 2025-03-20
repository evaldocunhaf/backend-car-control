package com.carcontrol.persistencia.impl;

import com.carcontrol.persistencia.entidades.Usuario;
import com.carcontrol.persistencia.mapper.UsuarioMapper;
import com.carcontrol.persistencia.assinaturas.UsuarioRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final JdbcTemplate jdbcTemplate;

    public UsuarioRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void salvarUsuario(Usuario usuario) {
        String sql = "INSERT INTO USUARIO(login, senha, imagem, tipo_assinatura, email) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, usuario.getLogin(), usuario.getPassword(), usuario.getImagem(), usuario.getTipoAssinatura().getCodigo(), usuario.getEmail());
    }

    public void atualizarusuario(Usuario usuario, String username) {
        String sql = "UPDATE USUARIO SET login = ?, senha = ?, imagem = ?, tipo_assinatura = ?, email = ? WHERE login = ?";
        jdbcTemplate.update(sql, usuario.getLogin(), usuario.getPassword(), usuario.getImagem(), usuario.getTipoAssinatura().getCodigo(), usuario.getEmail(), username);
    }

    @Override
    public void deletarUsuario(String usuario) {
        String sql = "DELETE FROM USUARIO WHERE login = ?";
        jdbcTemplate.update(sql, usuario);
    }

    @Override
    public Usuario findUsuarioByLogin(String login) {
        String sql = "SELECT * FROM USUARIO WHERE login = ?";
        try {
            return  jdbcTemplate.queryForObject(sql, new UsuarioMapper(), login);
        }catch(EmptyResultDataAccessException e){
            return null;
        }
    }
}
