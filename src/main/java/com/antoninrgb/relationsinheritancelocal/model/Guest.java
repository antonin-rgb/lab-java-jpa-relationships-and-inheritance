package com.antoninrgb.relationsinheritancelocal.model;

import com.antoninrgb.relationsinheritancelocal.enums.GuestStatus;
import jakarta.persistence.*;

@Entity
public class Guest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    @Enumerated(EnumType.STRING) private GuestStatus status; // (enum: ATTENDING, NOT_ATTENDING, NO_RESPONSE)
    @ManyToOne private Event event;

    public Guest(String name, GuestStatus status, Event event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }

    public Guest() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
