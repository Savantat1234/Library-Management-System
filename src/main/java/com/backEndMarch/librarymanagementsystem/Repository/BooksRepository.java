package com.backEndMarch.librarymanagementsystem.Repository;

import com.backEndMarch.librarymanagementsystem.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Integer> {
}
