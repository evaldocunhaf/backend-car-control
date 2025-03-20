package com.carcontrol.apresentacao.controlers;

import com.carcontrol.persistencia.entidades.Tipo;
import com.carcontrol.servicos.assinaturas.TipoService;
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
    public ResponseEntity<Tipo> buscarTipo(@PathVariable Long id) {
        return ResponseEntity.ok(tipoService.buscarTipoPorId(id));
    }
}
