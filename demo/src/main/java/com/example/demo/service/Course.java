package com.example.demo.service;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long cid;
    private  String cname;
    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
