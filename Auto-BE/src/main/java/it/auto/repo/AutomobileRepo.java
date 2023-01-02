package it.auto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.auto.model.Automobile;

@Repository
public interface AutomobileRepo extends JpaRepository<Automobile,Long>{
//	Automobile delete(Long id);
}
