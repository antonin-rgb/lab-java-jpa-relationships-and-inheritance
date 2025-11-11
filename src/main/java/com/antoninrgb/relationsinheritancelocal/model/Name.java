package com.antoninrgb.relationsinheritancelocal.model;

import jakarta.persistence.*;

@Entity
public class Name {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String salutation, String firstName, String middleName, String lastName) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name() {};

    public int getId() {
        return id;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
