package com.carcontrol.servicos.impl;

import com.carcontrol.persistencia.entidades.Usuario;
import com.carcontrol.persistencia.assinaturas.UsuarioRepository;
import com.carcontrol.servicos.assinaturas.UsuarioService;
import com.carcontrol.servicos.exceptions.*;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    private PasswordEncoder passwordEncoder;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void salvarUsuario(Usuario usuario) throws NomeDeUsuarioJaCadastradoException {
        if(usuarioRepository.findUsuarioByLogin(usuario.getLogin()) != null){
            throw new NomeDeUsuarioJaCadastradoException("Nome: " + usuario.getLogin() + " já existente");
        }
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuarioRepository.salvarUsuario(usuario);
    }

    public void atualizarUsuario(Usuario usuario, String username){// throws UsuarioNaoEncontradoException {
        if(usuarioRepository.findUsuarioByLogin(usuario.getLogin()) == null){
            throw new UsuarioNaoEncontradoException("Nome: " + username + " não encontrado");
        }
        usuarioRepository.atualizarusuario(usuario, username);
    }

    public void deletarUsuario(String usuario) {
        if(usuarioRepository.findUsuarioByLogin(usuario) == null){
            throw new UsuarioNaoEncontradoException("Nome: " + usuario + " não encontrado");
        }
        usuarioRepository.deletarUsuario(usuario);
    }

    @Override
    public Usuario findUsuarioByLogin(String login) {
        return usuarioRepository.findUsuarioByLogin(login);
    }
}
