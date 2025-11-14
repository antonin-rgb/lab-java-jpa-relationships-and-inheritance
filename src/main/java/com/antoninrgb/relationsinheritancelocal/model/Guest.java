package com.antoninrgb.relationsinheritancelocal.model;

import com.antoninrgb.relationsinheritancelocal.enums.GuestStatus;
import jakarta.persistence.*;

@Entity
public class Guest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    @Enumerated(EnumType.STRING) private GuestStatus status; // (enum: ATTENDING, NOT_ATTENDING, NO_RESPONSE)

}
