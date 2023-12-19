package edu.alisson.sistemapdv.service;

import edu.alisson.sistemapdv.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    List<Produto> getAll();
    Optional<Produto> getById(String idProduto);
    Produto save(Produto produto);
    void delete(String idProduto);
    Produto update(String idProduto, Produto produto);
}
