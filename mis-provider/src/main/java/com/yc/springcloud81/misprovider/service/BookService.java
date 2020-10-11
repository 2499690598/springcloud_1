package com.yc.springcloud81.misprovider.service;

import com.yc.springcloud81.misprovider.bean.Book;

import java.util.List;

public interface BookService {
        public Book getBook(Integer id);

        public List<Book> getAll();
}
