package com.example.beehyv.ASSESMENT_TASK2.Controller;

import com.example.beehyv.ASSESMENT_TASK2.Request.BookREquest;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.beehyv.ASSESMENT_TASK2.model.Book;
import com.example.beehyv.ASSESMENT_TASK2.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookCOntroller {

    @Autowired
    private BookService bookService;

    @GetMapping("books/{bookId}")
    public Book getBookDetails(@PathVariable("bookId") int bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping("books")
    public Book addNewBook(@RequestBody BookREquest req) {
        System.out.println(req);
        return bookService.addBook(req);

    }
}