package com.example.demo.controller;

import com.example.demo.repository.personrepo;

import com.example.demo.repository.phonenumdersrepo;
import com.example.demo.service.Person;
import com.example.demo.service.phonenumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class phonenumberscon {
    @Autowired
    private phonenumdersrepo phonenumbersrepo;

    @PostMapping("savephonenumber")
    public ResponseEntity<String> saveaddress(@RequestBody phonenumbers phonenumbers) {
        phonenumbersrepo.save(phonenumbers);
        return new ResponseEntity<String>("Sucess", HttpStatus.OK);


    }

    @GetMapping("getphonenumber/{id}")
    public Optional<phonenumbers> getbyid(@PathVariable("id") Long id) {
        Optional<phonenumbers> p =  phonenumbersrepo.findById(id);
        return p;
    }
}
