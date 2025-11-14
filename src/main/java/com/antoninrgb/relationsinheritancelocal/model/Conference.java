package com.antoninrgb.relationsinheritancelocal.model;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;

    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
