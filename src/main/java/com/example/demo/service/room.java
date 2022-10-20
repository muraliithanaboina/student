package com.example.demo.service;

import javax.persistence.*;

@Entity
public class room {
    @Id
    @GeneratedValue
   private Integer rid;
   private  String name;
   @OneToOne
   private  student student;

    public room(String name, student student) {

        this.name = name;
        this.student = student;
    }

    public room() {
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public student getStudent() {
        return student;
    }

    public void setStudent(student student) {
        this.student = student;
    }

}
