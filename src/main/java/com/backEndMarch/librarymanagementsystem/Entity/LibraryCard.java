package com.backEndMarch.librarymanagementsystem.Entity;

import com.backEndMarch.librarymanagementsystem.Enum.cardStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    private String validTill;
    @Enumerated(EnumType.STRING)
    private cardStatus status;
    @OneToOne
    @JoinColumn//connection from child table to parent table
    Student student;

}
