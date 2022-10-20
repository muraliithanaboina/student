package com.example.demo.repository;

import com.example.demo.service.password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface passwordrepo  extends JpaRepository<password,Long> {
}
