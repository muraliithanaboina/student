package com.example.demo.service;

import javax.persistence.*;


@Entity
public class employee extends salaruy {
    @Id
    @GeneratedValue
    private Integer eid;
    private String ename;

    public  employee() {
    }

    public employee(Long id, String tax, String ename) {
        super(id, tax);

        this.ename = ename;
    }



    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}
