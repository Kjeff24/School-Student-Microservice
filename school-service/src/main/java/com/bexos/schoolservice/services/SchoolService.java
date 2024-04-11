package com.bexos.schoolservice.services;

import com.bexos.schoolservice.dto.SchoolDto;
import com.bexos.schoolservice.dto.SchoolResponseDto;
import com.bexos.schoolservice.dto.StudentNameResponseDto;
import com.bexos.schoolservice.feign.StudentInterface;
import com.bexos.schoolservice.mappers.SchoolMapper;
import com.bexos.schoolservice.models.School;
import com.bexos.schoolservice.repositories.SchoolRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;

    private final SchoolMapper schoolMapper;

    private final StudentInterface studentClient;

    public List<SchoolResponseDto> findAllSchools(){

        return repository.findAll()
                .stream()
                .map(schoolMapper::toSchoolResponseDto)
                .collect(Collectors.toList());
    }

    public SchoolDto createSchool(SchoolDto schoolDto){
        var school = schoolMapper.toSchool(schoolDto);
        var savedSchool = repository.save(school);
        return schoolMapper.toSchoolDto(savedSchool);
    }

    public Optional<School> findSchoolById(Integer id){
        return repository.findById(id);
    }


    public ResponseEntity<List<StudentNameResponseDto>> findAllStudentsBySchool(Integer school_id) {

        return studentClient.findAllStudentBySchool(school_id);
    }
}
