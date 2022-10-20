package com.example.demo.controller;

import com.example.demo.repository.Addressrepo;
import com.example.demo.service.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class addresscon {
    @Autowired
    private Addressrepo addressrepo;
    @PostMapping("saveaddress")
    public ResponseEntity<String> saveaddress(@RequestBody Address address){
        addressrepo.save(address);
        return new ResponseEntity<String>("Sucess", HttpStatus.OK);


    }
    @GetMapping("getaddress/{id}")
    public Address getbyid(@PathVariable("id")Long id){
     Optional<Address> address =  addressrepo.findById(id);
        return  address.get();
    }
}
