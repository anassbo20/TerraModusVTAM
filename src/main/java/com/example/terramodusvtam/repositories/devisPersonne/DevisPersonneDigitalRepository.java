package com.example.terramodusvtam.repositories.devisPersonne;
import com.example.terramodusvtam.entities.devisPersonne.DevisPersonneDigital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisPersonneDigitalRepository extends JpaRepository<DevisPersonneDigital,Long> {

}
