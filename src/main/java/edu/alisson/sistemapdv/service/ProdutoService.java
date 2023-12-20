package edu.alisson.sistemapdv.service;

import edu.alisson.sistemapdv.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    List<Produto> getAll();
    Optional<Produto> getById(Integer idProduto);
    Produto save(Produto produto);
    void delete(Integer idProduto);
    void update(Integer idProduto, Produto produto);
}
