package com.example.demo.service;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private  Long pid;
    private  String pname;

    @Enumerated(EnumType.STRING)
    private  Gender gender;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

//  //  public com.example.demo.service.password getPassword() {
//        return password;
//    }
//
//    public void setPassword(com.example.demo.service.password password) {
//        this.password = password;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public List<com.example.demo.service.phonenumbers> getPhonenumbers() {
//        return phonenumbers;
//    }
//
//    public void setPhonenumbers(List<com.example.demo.service.phonenumbers> phonenumbers) {
//        this.phonenumbers = phonenumbers;
//    }
//
//    public List<Course> getCourse() {
//        return course;
//    }
//
//    public void setCourse(List<Course> course) {
//        this.course = course;
//    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
