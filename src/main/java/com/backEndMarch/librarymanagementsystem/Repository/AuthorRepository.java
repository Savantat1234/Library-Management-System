package com.backEndMarch.librarymanagementsystem.Repository;

import com.backEndMarch.librarymanagementsystem.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
