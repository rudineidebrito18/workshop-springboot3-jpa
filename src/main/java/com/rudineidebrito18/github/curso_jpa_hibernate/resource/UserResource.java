package com.rudineidebrito18.github.curso_jpa_hibernate.resource;

import com.rudineidebrito18.github.curso_jpa_hibernate.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Fulano", "fulano@gmail.com", "949494", "12354");
        return ResponseEntity.ok().body(u);
    }
}
