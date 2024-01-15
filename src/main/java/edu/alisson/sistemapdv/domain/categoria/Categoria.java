package edu.alisson.sistemapdv.domain.categoria;

public enum Categoria {
    Padaria("Padaria"), Carnes("Carnes"), Mercearia("Mercearia"), Matinais("Matinais"), Frios("Frios"), Laticínios("Laticínios"), Bebidas("Bebidas"), Limpeza("Limpeza"), Higiene("Higiene"), Hortifruti("Hortifruti"), PetShop("PetShop");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
