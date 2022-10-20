package com.example.demo.service;

import javax.persistence.*;

@Entity
public class phonenumbers {
    @Id
    @GeneratedValue
    private Long phoneid;
    private  Long phoneno;
    @ManyToOne(cascade = CascadeType.ALL)
private Person person;
    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
    public Long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(Long phoneid) {
        this.phoneid = phoneid;
    }

    public Long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Long phoneno) {
        this.phoneno = phoneno;
    }

}
