package com.stefanalexnovak.springhibernatelibraryapp.bootstrap;

import com.stefanalexnovak.springhibernatelibraryapp.model.Book;
import com.stefanalexnovak.springhibernatelibraryapp.services.BookService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final BookService bookService;

    public DataLoader(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        Book book1 = new Book();
        book1.setTitle("To Kill A Mockingbird");
        book1.setAuthor("Harper Lee");
        book1.setGenre("Classic");
        book1.setLocation("Right Bookshelf");
        book1.setSpecial("Year 10 study");
        bookService.save(book1);

        Book book2 = new Book();
        book1.setTitle("Lord of the Flies");
        book1.setAuthor("William Golding");
        book1.setGenre("Classic");
        book1.setLocation("Right Bookshelf");
        bookService.save(book2);

        Book book3 = new Book();
        book1.setTitle("The Iliad");
        book1.setAuthor("Homer");
        book1.setGenre("Classic");
        book1.setLocation("Right Bookshelf");
        bookService.save(book3);

        Book book4 = new Book();
        book1.setTitle("A Game of Thrones");
        book1.setAuthor("G.R.R. Martin");
        book1.setGenre("Fantasy");
        book1.setLocation("Right Bookshelf");
        book1.setSpecial("My favourite");
        bookService.save(book4);
    }
}
