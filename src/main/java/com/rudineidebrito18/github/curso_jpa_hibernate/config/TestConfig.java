package com.rudineidebrito18.github.curso_jpa_hibernate.config;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.User;
import com.rudineidebrito18.github.curso_jpa_hibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Fulano", "fulano@gmail.com", "949494", "12354");
        User u2 = new User(null, "Cicrano", "cicrano@gmail.com", "396834", "32563");
        User u3 = new User(null, "Deltano", "deltano@gmail.com", "356545", "74787");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}
