package com.carcontrol.persistencia.repositorios;

import com.carcontrol.persistencia.entidades.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
}
