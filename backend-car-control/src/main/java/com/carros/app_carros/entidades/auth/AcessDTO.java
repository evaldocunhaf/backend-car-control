package com.carros.app_carros.entidades.auth;

public class AcessDTO {
    //TODO: Fazer retornar o usuário e liberações

    private String token;

    public AcessDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
