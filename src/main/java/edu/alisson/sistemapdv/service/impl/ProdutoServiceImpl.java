package edu.alisson.sistemapdv.service.impl;

import edu.alisson.sistemapdv.domain.categoria.Categoria;
import edu.alisson.sistemapdv.domain.produto.Produto;
import edu.alisson.sistemapdv.repository.ProdutoRepository;
import edu.alisson.sistemapdv.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll(Sort.by(Sort.Direction.ASC, "idProduto"));
    }

    @Override
    public Optional<Produto> getById(Integer idProduto) {
        return produtoRepository.findById(idProduto);
    }

    @Override
    public List<String> getCategorias() {
        Categoria categorias[] = Categoria.values();
        List<String> categoria = Arrays.stream(categorias).map(cat -> {return cat.getDescricao();}).collect(Collectors.toList());
        return categoria;
    }

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void delete(Integer idProduto) {
        Optional<Produto> query = produtoRepository.findById(idProduto);
        if (query.isPresent()) {
            produtoRepository.deleteById(idProduto);
        }
    }

    @Override
    public void update(Integer idProduto, Produto produto) {
        Optional<Produto> query = produtoRepository.findById(idProduto);
        if (query.isPresent()) {
            Produto prod = query.get();
            prod.setNomeProduto(produto.getNomeProduto());
            prod.setCategoria(produto.getCategoria());
            prod.setDescricao(produto.getDescricao());
            prod.setValUnitario(produto.getValUnitario());

            produtoRepository.save(prod);
        }
    }
}
