package com.bexos.studentservice.repositories;

import com.bexos.studentservice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByFirstNameContaining(String firstname);
    List<Student> findBySchoolId(Integer school_id);
}
