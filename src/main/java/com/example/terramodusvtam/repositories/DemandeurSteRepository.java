package com.example.terramodusvtam.repositories;
import com.example.terramodusvtam.entities.devisSte.DemandeurSte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeurSteRepository extends JpaRepository<DemandeurSte,Long> {
}
