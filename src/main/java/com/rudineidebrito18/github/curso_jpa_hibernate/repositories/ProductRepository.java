package com.rudineidebrito18.github.curso_jpa_hibernate.repositories;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
