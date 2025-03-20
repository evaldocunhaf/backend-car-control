package com.carcontrol.servicos.assinaturas;

import com.carcontrol.persistencia.entidades.Usuario;

public interface UsuarioService {

    void salvarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario, String username);
    void deletarUsuario(String usuario);
    Usuario findUsuarioByLogin(String login);

}
