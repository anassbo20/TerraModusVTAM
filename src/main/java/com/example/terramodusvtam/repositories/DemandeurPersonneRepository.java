package com.example.terramodusvtam.repositories;
import com.example.terramodusvtam.entities.devisPersonne.DemandeurPersonne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeurPersonneRepository extends JpaRepository<DemandeurPersonne,Long> {
}
