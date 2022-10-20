package com.example.demo.repository;

import com.example.demo.service.phonenumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface phonenumdersrepo extends JpaRepository<phonenumbers,Long> {
}
