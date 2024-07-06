package com.rudineidebrito18.github.curso_jpa_hibernate.services;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Category;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.User;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.CategoryRepository;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> category = repository.findById(id);
        return category.get();
    }
}
