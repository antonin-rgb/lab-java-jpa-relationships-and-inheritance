package com.antoninrgb.relationsinheritancelocal.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Division {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    private int district;
    @OneToOne private Member president;
    @OneToMany(fetch = FetchType.EAGER) private List<Member> members;
    @ManyToOne private Association association;

    public Division(String name, int district, Member president, List<Member> members, Association association) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
        this.association = association;
    }

    public Division() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
