package com.yc.springcloud81.misprovider.controller;

import com.yc.springcloud81.misprovider.bean.Book;
import com.yc.springcloud81.misprovider.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("{id}")
    public Book getBook(@PathVariable("id") Integer id){
        return bookService.getBook(id);
    }

    @GetMapping
    public List<Book> getAll(){ return bookService.getAll();}
}
