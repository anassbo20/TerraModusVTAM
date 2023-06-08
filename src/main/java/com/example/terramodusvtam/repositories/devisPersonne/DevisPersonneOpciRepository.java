package com.example.terramodusvtam.repositories.devisPersonne;
import com.example.terramodusvtam.entities.devisPersonne.DevisPersonneOpci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisPersonneOpciRepository extends JpaRepository<DevisPersonneOpci,Long> {

}
