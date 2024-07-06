package com.rudineidebrito18.github.curso_jpa_hibernate.config;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Order;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.enums.OrderStatus;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.User;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.OrderRepository;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Fulano", "fulano@gmail.com", "949494", "12354");
        User u2 = new User(null, "Cicrano", "cicrano@gmail.com", "396834", "32563");
        User u3 = new User(null, "Deltano", "deltano@gmail.com", "356545", "74787");
        User u4 = new User(null, "Rudinei", "rudinei@gmail.com", "568756", "37456");
        User u5 = new User(null, "Maria", "maria@gmail.com", "788768", "978366");
        User u6 = new User(null, "Paulo", "paulo@gmail.com", "478478", "896656");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6));

        Order o1 = new Order(null, Instant.parse("2024-01-01T12:00:00Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2024-01-02T13:00:00Z"), OrderStatus.PAID, u3);
        Order o3 = new Order(null, Instant.parse("2024-01-03T14:00:00Z"), OrderStatus.DELIVERED, u3);
        Order o4 = new Order(null, Instant.parse("2024-01-04T15:00:00Z"), OrderStatus.SHIPPED, u2);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
    }
}
