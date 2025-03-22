package com.carcontrol.servicos.impl;

import com.carcontrol.persistencia.entidades.Usuario;
import com.carcontrol.persistencia.repositorios.UsuarioRepository;
import com.carcontrol.servicos.assinaturas.UsuarioService;
import com.carcontrol.servicos.exceptions.*;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    private PasswordEncoder passwordEncoder;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void salvarUsuario(Usuario usuario) throws NomeDeUsuarioJaCadastradoException {
        if(usuarioRepository.findByLogin(usuario.getLogin()) != null){
            throw new NomeDeUsuarioJaCadastradoException("Nome: " + usuario.getLogin() + " já existente");
        }
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuarioRepository.save(usuario);
    }

    public void atualizarUsuario(Usuario usuarioAtualizado, String username){// throws UsuarioNaoEncontradoException {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByLogin(username);
        if(!usuarioExistente.isPresent()){
            throw new UsuarioNaoEncontradoException("Nome: " + username + " não encontrado");
        }

    }

    public void deletarUsuario(String login) {
        Usuario usuario = usuarioRepository.findByLogin(login).orElse(null);
        if(usuario == null){
            throw new UsuarioNaoEncontradoException("Nome: " + usuario + " não encontrado");
        }
        usuarioRepository.delete(usuario);
    }

    @Override
    public Usuario findUsuarioByLogin(String login) {
        return usuarioRepository.findByLogin(login).orElse(null);
    }
}
