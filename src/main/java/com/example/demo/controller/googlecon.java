package com.example.demo.controller;

import com.example.demo.repository.googlerepo;
import com.example.demo.service.google;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class googlecon {
    @Autowired
    private googlerepo googlerepo;
    @PostMapping("savegoole")
    public String savegoogle(@RequestBody google goole){
        googlerepo.save(goole);
        return "sucess";

    }
}
