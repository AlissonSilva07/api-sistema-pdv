package edu.alisson.sistemapdv.service.impl;

import edu.alisson.sistemapdv.model.Produto;
import edu.alisson.sistemapdv.repository.ProdutoRepository;
import edu.alisson.sistemapdv.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> getById(String idProduto) {
        return produtoRepository.findById(idProduto);
    }

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void delete(String idProduto) {
        var query = produtoRepository.findById(idProduto);
        if (query.isPresent()) {
            produtoRepository.deleteById(idProduto);
        }
    }

    @Override
    public Produto update(String idProduto, Produto produto) {
        var query = produtoRepository.findById(idProduto);
        if (!query.isPresent()) {
            return null;
        }
        return produtoRepository.save(produto);
    }
}
