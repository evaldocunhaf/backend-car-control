package com.carros.app_carros.controlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TipoControler {
    private TipoService tipoService;

    public TipoControler(TipoService tipoService) {
        this.tipoService = tipoService;
    }

    @GetMapping
    public ResponseEntity<List<Tipo>> listarTipos() {
        return ResponseEntity.ok(tipoService.listarTipos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tipo> buscarTipo(@PathVariable Integer id) {
        return
    }
}
