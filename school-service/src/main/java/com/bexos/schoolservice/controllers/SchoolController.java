package com.bexos.schoolservice.controllers;

import com.bexos.schoolservice.dto.SchoolDto;
import com.bexos.schoolservice.dto.SchoolResponseDto;
import com.bexos.schoolservice.dto.StudentNameResponseDto;
import com.bexos.schoolservice.models.School;
import com.bexos.schoolservice.services.SchoolService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public List<SchoolResponseDto> findAllSchools(){

        return schoolService.findAllSchools();
    }

    @PostMapping
    public SchoolDto createSchool(@Valid @RequestBody SchoolDto schoolDto){
        return this.schoolService.createSchool(schoolDto);
    }

    @GetMapping("/{school-id}")
    public Optional<School> findSchoolById(@PathVariable("school-id") Integer id){
        return schoolService.findSchoolById(id);
    }

    // Get students

    @GetMapping("/students/{school-id}")
    public ResponseEntity<List<StudentNameResponseDto>> findAllStudentsBySchool(@PathVariable("school-id") Integer school_id){
        return schoolService.findAllStudentsBySchool(school_id);
    }
}
