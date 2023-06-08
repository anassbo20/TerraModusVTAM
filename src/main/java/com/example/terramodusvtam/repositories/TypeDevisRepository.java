package com.example.terramodusvtam.repositories;
import com.example.terramodusvtam.entities.TypeDevis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDevisRepository extends JpaRepository<TypeDevis,Long> {
}
