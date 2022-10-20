package com.example.demo.controller;


import com.example.demo.repository.passwordrepo;

import com.example.demo.service.password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class passwordcon {


        @Autowired
        private passwordrepo passwordrepo;

        @PostMapping("savepassword")
        public ResponseEntity<String> saveaddress(@RequestBody password password) {
            passwordrepo.save(password);
            return new ResponseEntity<String>("Sucess", HttpStatus.OK);


        }

        @GetMapping("getpasword/{id}")
        public Optional<password> getbyid(@PathVariable("id") Long id) {
            Optional<password> p = passwordrepo.findById(id);
            return p;
        }

    }