package com.bexos.schoolservice.feign;

import com.bexos.schoolservice.dto.StudentNameResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("STUDENT-SERVICE")
public interface StudentInterface {
    @GetMapping("/api/v1/students/schools/{school_id}")
    ResponseEntity<List<StudentNameResponseDto>> findAllStudentBySchool(@PathVariable Integer school_id);
}
