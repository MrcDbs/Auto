package it.auto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.auto.model.Dettaglio;

@Repository
public interface DettaglioRepo extends JpaRepository<Dettaglio,Long>{

}
