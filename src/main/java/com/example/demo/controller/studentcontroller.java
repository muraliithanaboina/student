package com.example.demo.controller;

import com.example.demo.repository.studentjpa;
import com.example.demo.service.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class studentcontroller {
   private List<student>aaddd=new ArrayList<>();
   @Autowired
   private studentjpa studentjpa;
    @GetMapping("allstudents")
    public List<student> getallstudents(){
        List<student>students=new ArrayList<student>(Arrays.asList(new student(1,"murali"),new student(2,"kiran")));
       return students;
    }
    @GetMapping("getfile")
    public List<student> getfile() throws IOException {

        FileReader ff=new FileReader("C:\\studentssss.txt");
        BufferedReader bf=new BufferedReader(ff);
        for(String a= bf.readLine();a!=null;a= bf.readLine()){
            String[] aa=a.split(",");
            student students=new student(Integer.valueOf(aa[0]),aa[1]);
            aaddd.add(students);

        }
        studentjpa.saveAll(aaddd);
        return studentjpa.findAll();

    }
    @PostMapping("adddata")
    public student adddata(@RequestBody student students){
        studentjpa.save(students);
        aaddd.add(students);

return  students;
    }
    @GetMapping("getbyid")
    public Optional<student> getbyid(@RequestParam("id") Integer id){


       return studentjpa.findById(id);


    }
}
