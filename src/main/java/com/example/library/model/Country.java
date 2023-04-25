package com.example.library.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String continent;

    @OneToMany
    private List<Author> authors;

    public Country() {
    }

    public Country(String name, String continent, List<Author> authors) {
        this.name = name;
        this.continent = continent;
        this.authors = authors;
    }
}
