package com.carros.app_carros.entidades.usuario;

public interface UsuarioRepository {

    void salvarUsuario(Usuario usuario);
    void atualizarusuario(Usuario usuario, String username);
    void deletarUsuario(String usuario);
    Usuario findUsuarioByLogin(String login);

}
