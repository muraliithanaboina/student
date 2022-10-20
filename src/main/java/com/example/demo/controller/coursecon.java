package com.example.demo.controller;

import com.example.demo.repository.courserepo;
import com.example.demo.service.Address;
import com.example.demo.service.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class coursecon {
    @Autowired
    private courserepo courserepo;
    @PostMapping("savecourse")
    public ResponseEntity<String> saveaddress(@RequestBody Course course){
        courserepo.save(course);
        return new ResponseEntity<String>("Sucess", HttpStatus.OK);


    }
    @GetMapping("getcourse/{id}")
    public Optional< Course> getbyid(@PathVariable("id")Long id){
        Optional<Course> course =  courserepo.findById(id);
        return course;
    }
}


