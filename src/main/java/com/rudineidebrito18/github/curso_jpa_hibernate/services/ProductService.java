package com.rudineidebrito18.github.curso_jpa_hibernate.services;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Product;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
