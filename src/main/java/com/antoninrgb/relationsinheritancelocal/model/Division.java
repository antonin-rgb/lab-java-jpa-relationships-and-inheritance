package com.antoninrgb.relationsinheritancelocal.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Division {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    private int district;
    private String president;
    @OneToMany(fetch = FetchType.EAGER) private List<Member> members;
}
