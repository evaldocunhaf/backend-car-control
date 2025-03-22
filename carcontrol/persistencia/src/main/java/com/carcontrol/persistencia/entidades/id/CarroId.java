package com.carcontrol.persistencia.entidades.id;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CarroId implements Serializable {
    private String placa;
    private String cpf;

    public CarroId() {
    }

    public CarroId(String placa, String cpf) {
        this.placa = placa;
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroId carroId = (CarroId) o;
        return Objects.equals(placa, carroId.placa) &&
                Objects.equals(cpf, carroId.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, cpf);
    }
}
