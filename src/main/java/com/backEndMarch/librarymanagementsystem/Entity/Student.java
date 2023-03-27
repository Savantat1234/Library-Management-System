package com.backEndMarch.librarymanagementsystem.Entity;

import com.backEndMarch.librarymanagementsystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private Department department;
    private String email;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    // here u need to write a variable which is present in child for connection..
    //cascade = CascadeType.all,,,,,it will simply apply all crud operations  which r applied on parent like save etc on child also...
    LibraryCard card;


}
