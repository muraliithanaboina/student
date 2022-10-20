package com.example.demo.repository;


import com.example.demo.service.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface studentjpa extends JpaRepository<student,Integer> {
 Optional<student> findById(Integer id);
}
