package com.backEndMarch.librarymanagementsystem.Service;

import com.backEndMarch.librarymanagementsystem.Entity.Author;
import com.backEndMarch.librarymanagementsystem.Entity.Books;
import com.backEndMarch.librarymanagementsystem.Repository.AuthorRepository;
import com.backEndMarch.librarymanagementsystem.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;
    @Autowired
    AuthorRepository authorRepository;
    public void addBooks(Books books) throws Exception {
        Author author;
        try {
           author=  authorRepository.findById(books.getAuthor().getId()).get();// u get the author ka id
        }
        catch (Exception e){
            throw new Exception("Author not found");
        }
        List<Books> boosWritten = author.getBooks();
        boosWritten.add(books);
        authorRepository.save(author);

    }

}
