package edu.alisson.sistemapdv.controller;

import edu.alisson.sistemapdv.model.Produto;
import edu.alisson.sistemapdv.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/todos")
    public ResponseEntity<List<Produto>> todosProdutos() {
        return ResponseEntity.ok(produtoService.getAll());
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Optional<Produto>> produtoPorId(@PathVariable("id") String idProduto) {
        return ResponseEntity.ok(produtoService.getById(idProduto));
    }

    @PostMapping("/postar")
    public ResponseEntity<Produto> postarProduto(@RequestBody Produto produto) {
        produto.setDataCriacao(LocalDate.now());
        return ResponseEntity.ok(produtoService.save(produto));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable("id") String idProduto) {
        produtoService.delete(idProduto);
        return ResponseEntity.ok().body("O produto de id " + idProduto + " foi deletado com sucesso.");
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable("id") String idProduto, @RequestBody Produto produto) {
        produtoService.update(idProduto, produto);
        return ResponseEntity.ok(produto);
    }

}
