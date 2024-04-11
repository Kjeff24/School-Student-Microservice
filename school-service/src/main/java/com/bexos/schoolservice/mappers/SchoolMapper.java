package com.bexos.schoolservice.mappers;

import com.bexos.schoolservice.dto.SchoolDto;
import com.bexos.schoolservice.dto.SchoolResponseDto;
import com.bexos.schoolservice.models.School;
import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {


    public School toSchool(SchoolDto dto){
        return new School(dto.name());
    }

    public SchoolDto toSchoolDto(School school){
        return new SchoolDto(school.getName());
    }

    public SchoolResponseDto toSchoolResponseDto(School school){

        return new SchoolResponseDto(
                school.getId(),
                school.getName()
        );
    }
}
