package com.example.terramodusvtam.repositories.devisSte;
import com.example.terramodusvtam.entities.devisSte.DevisSteAmiable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisSteAmiableRepository extends JpaRepository<DevisSteAmiable,Long> {

}
