package com.carcontrol.apresentacao.security.userdetail;

import com.carcontrol.persistencia.entidades.Usuario;
import com.carcontrol.persistencia.repositorios.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UsuarioRepository usuarioRepository;

    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override //aqui ele vê se o usuário ta no banco de dados
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findUsuarioByLogin(username);
        return UserDetailsImpl.build(usuario);
    }
}
