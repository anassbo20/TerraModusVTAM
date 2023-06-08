package com.example.terramodusvtam.repositories;
import com.example.terramodusvtam.entities.Immob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImmobRepository extends JpaRepository<Immob,Long> {
}
