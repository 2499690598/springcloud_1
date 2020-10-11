package com.yc.springcloud81.misprovider.service;

import com.yc.springcloud81.misprovider.bean.Book;
import com.yc.springcloud81.misprovider.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired(required = false)
    private BookMapper bookMapper;

    public Book getBook(Integer id){
        return bookMapper.selectByPrimaryKey(id);
    }

    public List<Book> getAll(){ return bookMapper.selectAll();}
}
