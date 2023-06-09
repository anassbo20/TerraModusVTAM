package com.example.terramodusvtam.controller;
import com.example.terramodusvtam.entities.TypeDevis;
import com.example.terramodusvtam.repositories.TypeDevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/type-devis")
public class TypeDevisController {
    @Autowired
    private TypeDevisRepository typeDevisRepository;

    @PostMapping("/")
    public void saveTypeDevise(@RequestBody TypeDevis typeDevis) {
        typeDevisRepository.save(typeDevis);
    }
    @GetMapping("/")
    public List<TypeDevis> findAll() {
        return typeDevisRepository.findAll();
    }
    @GetMapping("/id/{id}")
    public TypeDevis findById(@PathVariable Long id) {
        return typeDevisRepository.getOne(id);
    }

}
