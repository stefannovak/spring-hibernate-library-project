package com.stefanalexnovak.springhibernatelibraryapp.dao;

import com.stefanalexnovak.springhibernatelibraryapp.model.Book;

import java.util.List;

public interface BookDAO {
    List<Book> findAll();
    Book findById(Long id);
    void update(Book book, String[] params);
    void save();
    void delete();
}
