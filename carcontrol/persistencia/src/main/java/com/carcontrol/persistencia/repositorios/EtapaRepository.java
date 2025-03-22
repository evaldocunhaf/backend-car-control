package com.carcontrol.persistencia.repositorios;

import java.util.List;
import com.carcontrol.persistencia.entidades.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtapaRepository extends JpaRepository<Etapa, Integer> {
}
