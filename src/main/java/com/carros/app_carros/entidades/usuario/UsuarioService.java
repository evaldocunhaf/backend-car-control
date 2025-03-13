package com.carros.app_carros.entidades.usuario;

public interface UsuarioService {

    void salvarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario, String username);
    void deletarUsuario(String usuario);
    Usuario findUsuarioByLogin(String login);

}
