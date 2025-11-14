package com.antoninrgb.relationsinheritancelocal.model;

import jakarta.persistence.*;

@Entity
public class Speaker {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    private int presentationDuration;
    @ManyToOne private Conference conference;

    public Speaker(String name, int presentationDuration, Conference conference) {
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.conference = conference;
    }

    public Speaker() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }
}
