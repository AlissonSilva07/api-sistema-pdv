package edu.alisson.sistemapdv.domain.produto;

import edu.alisson.sistemapdv.domain.categoria.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProduto;
    private LocalDateTime dataCriacao;
    private String nomeProduto;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String descricao;
    private double valUnitario;
    private boolean isChecked;
}
