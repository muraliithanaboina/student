package com.example.demo.controller;

import com.example.demo.repository.drugsellerrepo;
import com.example.demo.service.drugseller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@RestController
public class drugsellercon {
    @Autowired
   private drugsellerrepo drugsellerrepo;
    @PostMapping("adddrug")
    public  List<drugseller> adddrug(@RequestBody List<drugseller>j){
        for (drugseller k:j
             ) {
            drugsellerrepo.save(k);
        }

        return drugsellerrepo.findAll();

    }
    @PostMapping("adddrugs")
    public String  adddrug(@RequestBody Map<String,drugseller>k){


        return "sucess";
    }

}
