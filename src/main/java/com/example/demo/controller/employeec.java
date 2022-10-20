package com.example.demo.controller;

import com.example.demo.repository.empin;
import com.example.demo.service.employee;
import org.springframework.beans.factory.annotation.Autowired;

public class employeec {
    @Autowired
    private empin empin;
    public  void  save(){
        employee e=new employee(1L,"murali","ithanaboina");

        empin.save(e);
    }
}
