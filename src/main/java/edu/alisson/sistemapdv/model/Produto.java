package edu.alisson.sistemapdv.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idProduto;
    private Instant dataCriacao;
    private String nomeProduto;
    private Categoria categoria;
    private String descricao;
    private float valUnitario;

}
