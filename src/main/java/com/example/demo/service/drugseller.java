package com.example.demo.service;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class drugseller {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer turnover;
    private String place;

    public drugseller( String name, Integer turnover, String place) {

        this.name = name;
        this.turnover = turnover;
        this.place = place;
    }

    public drugseller() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "drugseller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", turnover=" + turnover +
                ", place='" + place + '\'' +
                '}';
    }
}
