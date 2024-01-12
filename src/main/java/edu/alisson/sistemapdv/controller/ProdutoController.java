package edu.alisson.sistemapdv.controller;

import edu.alisson.sistemapdv.model.Produto;
import edu.alisson.sistemapdv.model.response.ResponseHandler;
import edu.alisson.sistemapdv.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/todos")
    public ResponseEntity<List<Produto>> todosProdutos() {
        return ResponseEntity.ok(produtoService.getAll());
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Object> produtoPorId(@PathVariable("id") Integer idProduto) {
        Optional<Produto> produto = produtoService.getById(idProduto);

        if (produto.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A busca por código não retornou nenhum produto com o id " + idProduto + ", tente novamente.");
        } else {
            return ResponseEntity.ok(produto);
        }
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
    public ResponseEntity<Void> deletarProduto(@PathVariable("id") List<Integer> idsProdutos) {
        for (Integer param : idsProdutos) {
            produtoService.delete(param);
        }
        return ResponseEntity.ok().build();
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Void> atualizarProduto(@PathVariable("id") Integer idProduto, @RequestBody Produto produto) {
        produtoService.update(idProduto, produto);
        return ResponseEntity.ok().build();
    }

}
