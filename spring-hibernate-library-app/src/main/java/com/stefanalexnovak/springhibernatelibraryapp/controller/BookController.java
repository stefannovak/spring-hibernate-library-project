package com.stefanalexnovak.springhibernatelibraryapp.controller;

import com.stefanalexnovak.springhibernatelibraryapp.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @RequestMapping("/")
    public String test(Model model) {
        Book book = new Book(0, "Eh", "waow", "amazing!", "one more?");
        model.addAttribute("book", book);
        return "home";
    }

    @RequestMapping("/form")
    public String form(Model model) {
        return "form";
    }
}