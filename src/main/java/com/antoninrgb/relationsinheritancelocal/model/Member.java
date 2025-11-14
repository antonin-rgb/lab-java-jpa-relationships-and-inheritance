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

    public Member(String name, MemberStatus status, LocalDate renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public Member() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }
}
