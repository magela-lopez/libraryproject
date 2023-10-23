package com.biblioteca.virtual.controller;

import com.biblioteca.virtual.service.GoogleBooksFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/booksAPI")
public class GoogleBooksController {
    @Autowired
    private GoogleBooksFeignClientService googleBooksFeignClientService;

    @GetMapping
    public String getAllBooks(@RequestParam String query){
        return googleBooksFeignClientService.getBooksByParam(query);

    }

}
