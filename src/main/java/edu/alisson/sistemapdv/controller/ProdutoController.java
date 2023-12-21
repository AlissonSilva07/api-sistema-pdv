package edu.alisson.sistemapdv.controller;

import edu.alisson.sistemapdv.model.Categoria;
import edu.alisson.sistemapdv.model.Produto;
import edu.alisson.sistemapdv.repository.ProdutoRepository;
import edu.alisson.sistemapdv.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/todos")
    public ResponseEntity<List<Produto>> todosProdutos() {
        return ResponseEntity.ok(produtoService.getAll());
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Optional<Produto>> produtoPorId(@PathVariable("id") Integer idProduto) {
        return ResponseEntity.ok(produtoService.getById(idProduto));
    }

    @GetMapping("/categorias")
    public ResponseEntity<List<String>> todasCategorias() {
        return ResponseEntity.ok(produtoService.getCategorias());
    }

    @PostMapping("/postar")
    public ResponseEntity<Produto> postarProduto(@RequestBody Produto produto) {
        produto.setDataCriacao(LocalDate.now());
        return ResponseEntity.ok(produtoService.save(produto));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable("id") Integer idProduto) {
        produtoService.delete(idProduto);
        return ResponseEntity.ok().body("O produto de id " + idProduto + " foi deletado com sucesso.");
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizarProduto(@PathVariable("id") Integer idProduto, @RequestBody Produto produto) {
        produtoService.update(idProduto, produto);
        return ResponseEntity.ok("O produto de id " + idProduto +
                " foi atualizado com as seguintes características:"
                + " nome do produto: " + produto.getNomeProduto()
                + ", categoria: " + produto.getCategoria()
                + ", descrição: " + produto.getDescricao()
                + ", valor unitário: " + produto.getValUnitario()
        );
    }

}
