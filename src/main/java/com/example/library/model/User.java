package com.example.library.model;

import com.example.library.model.enumerations.Role;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "library_users")
public class User {

    @Id
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User() {
    }
}
