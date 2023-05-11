package com.backEndMarch.librarymanagementsystem.DTO;

import com.backEndMarch.librarymanagementsystem.Enum.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BooksRequestDTO {
    private String title;
    private int price;
    private Genre genre;
    private int authorId;

}
