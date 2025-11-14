package com.antoninrgb.relationsinheritancelocal.model;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    private LocalDate date;
    private int duration;
    @ManyToMany private List<Guest> guests;

}
