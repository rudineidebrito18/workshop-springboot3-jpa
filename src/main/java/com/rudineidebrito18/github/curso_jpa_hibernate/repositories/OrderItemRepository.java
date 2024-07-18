package com.rudineidebrito18.github.curso_jpa_hibernate.repositories;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.OrderItem;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
