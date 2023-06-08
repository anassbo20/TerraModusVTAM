package com.example.terramodusvtam.repositories;
import com.example.terramodusvtam.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
