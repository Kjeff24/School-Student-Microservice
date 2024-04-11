package com.bexos.schoolservice.repositories;

import com.bexos.schoolservice.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
