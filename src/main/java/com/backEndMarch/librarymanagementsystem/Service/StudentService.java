package com.backEndMarch.librarymanagementsystem.Service;

import com.backEndMarch.librarymanagementsystem.Entity.LibraryCard;
import com.backEndMarch.librarymanagementsystem.Entity.Student;
import com.backEndMarch.librarymanagementsystem.Enum.cardStatus;
import com.backEndMarch.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){
        LibraryCard card = new LibraryCard();
        // set the value of card
        card.setStatus(cardStatus.ACTIVATED);
        card.setValidTill("03/2025");
        //we need student for which we r making card
        card.setStudent(student);

        //set the card attribute for student
        student.setCard(card);
        studentRepository.save(student);


    }
}
