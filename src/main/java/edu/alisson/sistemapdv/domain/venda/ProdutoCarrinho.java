package edu.alisson.sistemapdv.domain.venda;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "produto_carrinho")
public class ProdutoCarrinho {
    @Id
    private Integer idItem;
    private Integer codigo;
    private String titulo;
    private Integer quantidade;
    private double valUnit;
    private double total;
}
