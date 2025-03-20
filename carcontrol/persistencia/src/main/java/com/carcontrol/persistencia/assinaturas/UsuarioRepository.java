package com.carcontrol.persistencia.assinaturas;

import com.carcontrol.persistencia.entidades.Usuario;

public interface UsuarioRepository {

    void salvarUsuario(Usuario usuario);
    void atualizarusuario(Usuario usuario, String username);
    void deletarUsuario(String usuario);
    Usuario findUsuarioByLogin(String login);

}
