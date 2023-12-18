package edu.alisson.sistemapdv.model;

public enum Categoria {
    PADARIA("Padaria"), CARNES("Carnes"), MERCEARIA("Mercearia"), MATINAIS("Matinais"), FRIOS_E_LATICINIOS("Frios e Laticínios"), BEBIDAS("Bebidas"), LIMPEZA("Limpeza"), HIGIENE("Higiene"), HORTIFRUTI("Hortifruti"), PETSHOP("Pet Shop");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
