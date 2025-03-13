package com.carros.app_carros.entidades.usuario.impl;

import com.carros.app_carros.entidades.usuario.Usuario;
import com.carros.app_carros.entidades.usuario.UsuarioRepository;
import com.carros.app_carros.entidades.usuario.UsuarioService;
import com.carros.app_carros.exceptions.NomeDeUsuarioJaCadastradoException;
import com.carros.app_carros.exceptions.UsuarioNaoEncontradoException;
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

    @Override
    public void salvarUsuario(Usuario usuario) throws NomeDeUsuarioJaCadastradoException {
        if(usuarioRepository.findUsuarioByLogin(usuario.getLogin()) != null){
            throw new NomeDeUsuarioJaCadastradoException("Nome: " + usuario.getLogin() + " já existente");
        }
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuarioRepository.salvarUsuario(usuario);
    }

    @Override
    public void atualizarUsuario(Usuario usuario, String username){// throws UsuarioNaoEncontradoException {
        if(usuarioRepository.findUsuarioByLogin(usuario.getLogin()) == null){
            throw new UsuarioNaoEncontradoException("Nome: " + username + " não encontrado");
        }
        usuarioRepository.atualizarusuario(usuario, username);
    }

    @Override
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
