package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.dto.BookDto;
import com.example.library.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies);
    Optional<Book> save(BookDto bookDto);
    Optional<Book> edit(Long id, String name, Category category, Long authorId, Integer availableCopies);
    Optional<Book> edit(Long id, BookDto bookDto);
    void deleteById(Long id);
    Optional<Book> rentBook(Long id);
    void returnBook(Long id);
}