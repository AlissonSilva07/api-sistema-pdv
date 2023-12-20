package edu.alisson.sistemapdv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDate;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProduto;
    @CreatedDate
    private LocalDate dataCriacao;
    private String nomeProduto;
    private Categoria categoria;
    private String descricao;
    private float valUnitario;

    public Produto(Integer idProduto, LocalDate dataCriacao, String nomeProduto, Categoria categoria, String descricao, float valUnitario) {
        this.idProduto = idProduto;
        this.dataCriacao = dataCriacao;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valUnitario = valUnitario;
    }

    public Produto() {}

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValUnitario() {
        return valUnitario;
    }

    public void setValUnitario(float valUnitario) {
        this.valUnitario = valUnitario;
    }
}
