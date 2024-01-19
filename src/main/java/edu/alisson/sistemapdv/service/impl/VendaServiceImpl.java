package edu.alisson.sistemapdv.service.impl;

import edu.alisson.sistemapdv.domain.venda.Venda;
import edu.alisson.sistemapdv.repository.VendaRepository;
import edu.alisson.sistemapdv.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaServiceImpl implements VendaService {
    @Autowired
    private VendaRepository vendaRepository;
    @Override
    public List<Venda> getAll() {
        return vendaRepository.findAll();
    }

    @Override
    public Venda save(Venda venda) {
        return vendaRepository.save(venda);
    }
}
