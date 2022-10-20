package com.example.demo.service;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
    @Id
    private Integer id;
    private  String name;

    public student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
