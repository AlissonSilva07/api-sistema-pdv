package edu.alisson.sistemapdv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public enum Categoria {
    Padaria("Padaria"), Carnes("Carnes"), Mercearia("Mercearia"), Matinais("Matinais"), Frios("Frios"), Laticínios("Laticínios"), Bebidas("Bebidas"), Limpeza("Limpeza"), Higiene("Higiene"), Hortifruti("Hortifruti"), PetShop("Pet Shop");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
