package com.stefanalexnovak.springhibernatelibraryapp.controller;

import com.stefanalexnovak.springhibernatelibraryapp.model.Book;
import com.stefanalexnovak.springhibernatelibraryapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @RequestMapping("/")
    public String test(Model model) {
        return "home";
    }

    public BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/form")
    public String bookForm(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "form";
    }

    @PostMapping("/form")
    String bookSubmitted(@ModelAttribute() Book book) {
        return "formSubmitted";
    }

//    @RequestMapping(value = "/submitted", method = RequestMethod.POST)
//    String resultPage(Model model) {
//        Book book = new Book();
//
//        model.addAttribute("Book", book);
//        return "formSubmitted";
//    }
}