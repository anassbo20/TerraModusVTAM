package com.example.terramodusvtam.controller;
import com.example.terramodusvtam.entities.Article;
import com.example.terramodusvtam.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping("/")
    public void saveArticle(@RequestBody Article article){
        articleRepository.save(article);
    }
    @GetMapping("/")
    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
