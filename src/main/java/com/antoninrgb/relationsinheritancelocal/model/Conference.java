package com.antoninrgb.relationsinheritancelocal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Conference extends Event {

    @ManyToMany private List<Speaker> speakers;
}
