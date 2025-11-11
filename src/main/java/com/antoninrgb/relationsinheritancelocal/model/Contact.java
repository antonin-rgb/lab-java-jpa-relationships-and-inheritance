package com.antoninrgb.relationsinheritancelocal.model;

import jakarta.persistence.*;

@Entity
public class Contact {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String company;
    private String title;
    @OneToOne private Name name;

    public Contact(String company, String title, Name name) {
        this.company = company;
        this.title = title;
        this.name = name;
    }

    public Contact() {}

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
