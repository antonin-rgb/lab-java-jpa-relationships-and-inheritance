package com.antoninrgb.relationsinheritancelocal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Speaker {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    private int presentationDuration;

}
