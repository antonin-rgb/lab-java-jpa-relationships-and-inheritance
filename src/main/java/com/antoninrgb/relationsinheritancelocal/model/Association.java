package com.antoninrgb.relationsinheritancelocal.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Association {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER) private List<Division> divisions;


}
