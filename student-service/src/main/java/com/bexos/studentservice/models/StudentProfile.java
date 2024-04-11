package com.bexos.studentservice.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentProfile {
    @Id
    @GeneratedValue
    private Integer id;
    private String bio;
    @OneToOne
    @JoinColumn(
    name = "student_id"
    )
    @JsonBackReference
    private Student student;

}
