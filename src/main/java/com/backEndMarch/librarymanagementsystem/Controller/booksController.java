package com.backEndMarch.librarymanagementsystem.Controller;

import com.backEndMarch.librarymanagementsystem.Entity.Books;
import com.backEndMarch.librarymanagementsystem.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class booksController {
    @Autowired
    BooksService booksService;
    @PostMapping("/add")
    public String addBooks(@RequestBody Books books){
     try{
         booksService.addBooks(books);
     }
     catch (Exception e){
         return "Book not added";
     }
     return "Book added successfuly";
    }
}
