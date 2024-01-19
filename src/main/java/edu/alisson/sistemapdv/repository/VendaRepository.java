package edu.alisson.sistemapdv.repository;

import edu.alisson.sistemapdv.domain.venda.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, String> {
}
