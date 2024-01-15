package edu.alisson.sistemapdv.service;

import edu.alisson.sistemapdv.domain.produto.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    List<Produto> getAll();
    Optional<Produto> getById(Integer idProduto);
    List<String> getCategorias();
    Produto save(Produto produto);
    void delete(Integer idProduto);
    void update(Integer idProduto, Produto produto);
}
