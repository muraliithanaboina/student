package com.example.demo.repository;

import com.example.demo.service.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface personrepo  extends JpaRepository<Person,Long> {
  @Query(value="select * from studentspring.person p join studentspring.address a on p.pid=a.person_pid where p.pid=:id",nativeQuery = true)

public Object getbyid(Long id);

}
