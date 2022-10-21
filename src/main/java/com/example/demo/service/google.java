package com.example.demo.repository;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
public class google {
    @Id
    @GeneratedValue
    private  Long gid;
    private String search;
    private String history;
    @OneToOne(cascade = CascadeType.ALL)

@Fetch(FetchMode.JOIN)
    @JoinColumn(referencedColumnName = "loptopid")
    private laptop laptop;


    public google(String search, String history) {
        this.search = search;
        this.history = history;
    }

    public google() {
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
