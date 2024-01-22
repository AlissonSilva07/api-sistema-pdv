package edu.alisson.sistemapdv.domain.venda;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idItem;
    private Integer numeroItem;
    private Integer codigo;
    private String titulo;
    private Integer qtd;
    private double valUnit;
    private double total;
}
