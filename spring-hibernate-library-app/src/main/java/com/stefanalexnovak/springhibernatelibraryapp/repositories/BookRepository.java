package com.stefanalexnovak.springhibernatelibraryapp.repositories;

import com.stefanalexnovak.springhibernatelibraryapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
