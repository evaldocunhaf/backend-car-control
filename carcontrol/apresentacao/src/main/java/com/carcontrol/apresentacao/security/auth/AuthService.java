package com.carcontrol.apresentacao.security.auth;

import com.carcontrol.apresentacao.security.userdetail.UserDetailsImpl;
import com.carcontrol.apresentacao.security.jwt.JwtUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private AuthenticationManager authenticationManager;

    private JwtUtils jwtUtils;

    public AuthService(AuthenticationManager authenticationManager, JwtUtils jwtUtils) {
        this.authenticationManager = authenticationManager;
        this.jwtUtils = jwtUtils;
    }

    public AcessDTO login(AuthDTO authDTO){

        try {
            UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(authDTO.getUsername(), authDTO.getPassword());

            Authentication authentication = authenticationManager.authenticate(userAuth);

            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

            String token = jwtUtils.generateTokenFromUserDetails(userDetails);

            AcessDTO acessDTO = new AcessDTO(token);

            return acessDTO;
        }catch (BadCredentialsException e){
            //TODO: Login ou senha invalidos
            System.out.println(e.getMessage());
        }
        return null;
    }
}
