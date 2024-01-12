package edu.alisson.sistemapdv.model;

import jakarta.persistence.*;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProduto;
    private LocalDate dataCriacao;
    private String nomeProduto;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String descricao;
    private double valUnitario;
    private boolean isChecked;

    public Produto(Integer idProduto, LocalDate dataCriacao, String nomeProduto, Categoria categoria, String descricao, double valUnitario, boolean isChecked) {
        this.idProduto = idProduto;
        this.dataCriacao = dataCriacao;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valUnitario = valUnitario;
        this.isChecked = isChecked;
    }

    public Produto() {}

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDataCriacao() {
        DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = br.format(this.dataCriacao);
        return dataFormatada;
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

    public double getValUnitario() {
        return valUnitario;
    }

    

    public void setValUnitario(double valUnitario) {
        this.valUnitario = valUnitario;
    }

    public boolean getIsChecked(){
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
}
