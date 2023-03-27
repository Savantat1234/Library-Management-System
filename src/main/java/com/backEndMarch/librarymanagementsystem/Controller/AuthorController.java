package com.backEndMarch.librarymanagementsystem.Controller;

import com.backEndMarch.librarymanagementsystem.Entity.Author;
import com.backEndMarch.librarymanagementsystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Author has been added successfuly";
    }
    @GetMapping("/get_authors")
    public List<Author> getAllAuthors(){
      return authorService.getAllAuthors();
    }
}
