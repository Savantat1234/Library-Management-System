package com.backEndMarch.librarymanagementsystem.DTO;

import com.backEndMarch.librarymanagementsystem.Enum.TransectionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class IssueBookResponseDTO {
    private String  transectionId;
    private String booksName;
    private TransectionStatus transectionStatus;
}
