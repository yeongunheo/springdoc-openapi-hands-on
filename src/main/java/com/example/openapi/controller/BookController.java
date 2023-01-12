package com.example.openapi.controller;

import com.example.openapi.entity.Book;
import com.example.openapi.exception.BookNotFoundException;
import com.example.openapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(HttpStatus.BAD_REQUEST));
    }

    @GetMapping("/")
    public Collection<Book> findBooks() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(@PathVariable("id") final String id,
                           @RequestBody final Book book) {
        return book;
    }
}
