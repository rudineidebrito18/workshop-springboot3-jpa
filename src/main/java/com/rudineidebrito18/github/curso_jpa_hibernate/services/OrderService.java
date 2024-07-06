package com.rudineidebrito18.github.curso_jpa_hibernate.services;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Order;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.User;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.OrderRepository;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> user = repository.findById(id);
        return user.get();
    }
}
