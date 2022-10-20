package com.example.demo.controller;

import com.example.demo.repository.roomrepo;
import com.example.demo.service.room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class roomcon {
    @Autowired
    @Transient
private roomrepo roomrepo;
    @PostMapping("addroom")
    public List<room> add(@RequestBody room room){
    roomrepo.save(room);
        return  roomrepo.findAll();
    }
}
