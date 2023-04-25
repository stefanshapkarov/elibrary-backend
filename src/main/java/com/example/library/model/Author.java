package com.example.library.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @ManyToOne
    private Country country;

    @OneToMany
    private List<Book> books;

    public Author() {
    }

    public Author(String name, String surname, Country country, List<Book> books) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.books = books;
    }
}
