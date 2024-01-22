package edu.alisson.sistemapdv.domain.venda;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vendas")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idVenda;
    private String dataCriacao;
    private String nomeCliente;
    private String telefone;
    private double valorTotal;
    private double troco;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "produto_id")
    private List<ProdutoCarrinho> carrinho;
}
