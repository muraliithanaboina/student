package com.example.demo.repository;

import com.example.demo.service.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courserepo  extends JpaRepository<Course,Long> {
}
