package com.antoninrgb.relationsinheritancelocal.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Association {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "association") private List<Division> divisions;

    public Association(String name, List<Division> divisions) {
        this.name = name;
        this.divisions = divisions;
    }

    public Association() {}

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }
}
