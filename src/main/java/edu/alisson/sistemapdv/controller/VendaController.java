package edu.alisson.sistemapdv.controller;

import edu.alisson.sistemapdv.domain.produto.Produto;
import edu.alisson.sistemapdv.domain.venda.Venda;
import edu.alisson.sistemapdv.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;
    @GetMapping("/todas")
    public ResponseEntity<List<Venda>> todasVendas() {
        return ResponseEntity.ok(vendaService.getAll());
    }

    @PostMapping("/postar")
    public ResponseEntity<Venda> postarProduto(@RequestBody Venda venda) {
        return ResponseEntity.ok(vendaService.save(venda));
    }
}
