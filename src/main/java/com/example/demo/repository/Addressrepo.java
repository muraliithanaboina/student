package com.example.demo.repository;

import com.example.demo.service.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Addressrepo  extends JpaRepository<Address,Long> {
}
