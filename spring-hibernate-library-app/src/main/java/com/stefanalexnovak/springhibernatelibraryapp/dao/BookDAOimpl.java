package com.stefanalexnovak.springhibernatelibraryapp.dao;

import com.stefanalexnovak.springhibernatelibraryapp.model.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookDAOimpl implements BookDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> findAll() {
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Book> criteria = builder.createQuery(Book.class);
        criteria.from(Book.class);
        List<Book> books = session.createQuery(criteria).getResultList();

        session.close();

        return books;
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public void update(Book book, String[] params) {
        book.setTitle(Objects.requireNonNull(params[0], "Title cannot be null"));

        books.add(book);
    }

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }
}
