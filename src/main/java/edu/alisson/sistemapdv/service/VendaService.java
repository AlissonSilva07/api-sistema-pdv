package edu.alisson.sistemapdv.service;

import edu.alisson.sistemapdv.domain.venda.Venda;

import java.util.List;
import java.util.Optional;

public interface VendaService {
    List<Venda> getAll();
    Venda save(Venda venda);
}
