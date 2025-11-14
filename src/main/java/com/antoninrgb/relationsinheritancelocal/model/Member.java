package com.antoninrgb.relationsinheritancelocal.model;
import com.antoninrgb.relationsinheritancelocal.enums.MemberStatus;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String name;
    @Enumerated(EnumType.STRING) private MemberStatus status;
    private LocalDate renewalDate;
}
