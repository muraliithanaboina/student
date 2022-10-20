package com.example.demo.service;

import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long aid;
    @OneToOne(cascade = CascadeType.ALL)
    private Person person;



    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

//    public List<com.example.demo.service.phonenumbers> getPhonenumbers() {
//        return phonenumbers;
//    }
//
//    public void setPhonenumbers(List<com.example.demo.service.phonenumbers> phonenumbers) {
//        this.phonenumbers = phonenumbers;
//    }
}
