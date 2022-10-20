package com.example.demo.service;

import javax.persistence.*;
import java.util.List;

@Entity
public class password {
    @Id
    private Long pasid;
    @OneToOne(cascade = CascadeType.ALL )
    private  Person person;


    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Long getPasid() {
        return pasid;
    }

    public void setPasid(Long pasid) {
        this.pasid = pasid;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
