package com.example.demo.service;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


 @Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class salaruy {

   private Long id;

   private String tax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public salaruy(Long id, String tax) {
        this.id = id;
        this.tax = tax;
    }

    public salaruy() {
    }

    @Override
    public String toString() {
        return "salaruy{" +
                "id=" + id +
                ", tax='" + tax + '\'' +
                '}';
    }
}
