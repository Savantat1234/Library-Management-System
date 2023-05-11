package com.backEndMarch.librarymanagementsystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//u dont need to write  @Entity  caz u r not storing dto class in DB
public class StudentUpdate_EmailRequestDTO {
    private int id;
    private String email;
}
