package com.rudineidebrito18.github.curso_jpa_hibernate.config;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Category;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Order;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.Product;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.enums.OrderStatus;
import com.rudineidebrito18.github.curso_jpa_hibernate.entities.User;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.CategoryRepository;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.OrderRepository;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category c1 = new Category(null, "Electronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");
        Category c4 = new Category(null, "Toys");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem Ipsum is simply dummy text of the printing", 76.7 , "image");
        Product p2 = new Product(null, "Iphone 15 pro max", " Lorem Ipsum has been the industry's standard dummy", 1000.0 , "image");
        Product p3 = new Product(null, "Little Principle", "Lorem Ipsum is simply dummy text of the printing", 36.5 , "image");
        Product p4 = new Product(null, "Notebook acer Predator top", " Lorem Ipsum has been the industry's standard dummy", 706.75 , "image");
        Product p5 = new Product(null, "Remote Car Hot wheels", " Lorem Ipsum has been the industry's standard", 96.7 , "image");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(c2);
        p2.getCategories().add(c1);
        p3.getCategories().add(c2);
        p4.getCategories().add(c1);
        p4.getCategories().add(c3);
        p5.getCategories().add(c4);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));


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
