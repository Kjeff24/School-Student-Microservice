package com.bexos.studentservice.dto;

public record StudentResponseDto(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {
}
