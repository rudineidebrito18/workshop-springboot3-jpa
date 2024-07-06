package com.rudineidebrito18.github.curso_jpa_hibernate.repositories;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
