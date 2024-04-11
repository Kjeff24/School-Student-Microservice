package com.bexos.studentservice.mappers;

import com.bexos.studentservice.dto.StudentDto;
import com.bexos.studentservice.dto.StudentNameResponseDto;
import com.bexos.studentservice.dto.StudentResponseDto;
import com.bexos.studentservice.models.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public Student toStudent(StudentDto dto){
        if(dto == null){
            throw new NullPointerException("The student Dto is null");
        }

        return new Student(
                dto.firstName(),
                dto.lastName(),
                dto.email(),
                dto.schoolId()
        );
    }

    public StudentResponseDto toStudentResponseDto(Student student){
        return new StudentResponseDto(
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getSchoolId()
        );
    }

    public StudentNameResponseDto studentNameResponseDto(Student student){
        return new StudentNameResponseDto(student.getName());
    }
}
