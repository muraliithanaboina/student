package com.example.demo.controller;

import com.example.demo.repository.passwordrepo;
import com.example.demo.repository.personrepo;
import com.example.demo.service.Person;
import com.example.demo.service.password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class personcon {
    @Autowired
    private personrepo  personrepo;

    @PostMapping("saveperson")
    public ResponseEntity<String> saveaddress(@RequestBody Person person) {
        personrepo.save(person);
        return new ResponseEntity<String>("Sucess", HttpStatus.OK);


    }


    @GetMapping("getperson/{id}")
    public Object getbyid(@PathVariable("id")Long id ) {
       Object p = personrepo.getbyid(id);
        return p;
    }
}
