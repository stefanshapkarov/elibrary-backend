package com.example.library.model.dto;

import com.example.library.model.enumerations.Category;
import lombok.Data;

@Data
public class BookDto {
    private String name;

    private Category category;

    private Long author;

    private Integer availableCopies;

    public BookDto(String name, String category, Long author, Integer availableCopies) {
        this.name = name;
        this.category = Category.valueOf(category);
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
