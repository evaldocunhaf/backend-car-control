package com.carros.app_carros.entidades.etapa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etapa")
public class EtapaControler {

    private EtapaService etapaService;

    public EtapaControler(EtapaService etapaService) {
        this.etapaService = etapaService;
    }
    @GetMapping()
    ResponseEntity<List<Etapa>> listarEtapas() {
        return ResponseEntity.ok(etapaService.listarEtapas());
    }

    @GetMapping("/{id}")
    ResponseEntity<Etapa> buscarEtapaPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(etapaService.buscarEtapaPorId(id));
    }
}
