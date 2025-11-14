package com.antoninrgb.relationsinheritancelocal.model;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String title;
    private LocalDate date;
    private int duration;
    private String location;
    @OneToMany(mappedBy = "event") private List<Guest> guests;

    public Event(String title, LocalDate date, int duration, String location, List<Guest> guests) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.guests = guests;
    }

    public Event() {}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
