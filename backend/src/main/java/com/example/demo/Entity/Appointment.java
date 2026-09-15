package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.EnumType;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class Appointment { // generate appointment id with random

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long apptID;

    @Column (nullable = false)
    String ownerName;

    @Column (nullable = false)
    private String petName;
    @Column (nullable = false)
    private String petBreed;
    @Column (nullable = false)
    private String phoneNumber;
    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private LocalDate date;
    @Column (nullable = false)
    private LocalTime time;
    @Column (nullable = false)
    private String reason;

    @Enumerated(EnumType.STRING)
    private ApptStatus status;

    @Enumerated(EnumType.STRING)
    private PetType petType;

    @Enumerated(EnumType.STRING)
    private ApptType apptType;

    @Enumerated(EnumType.STRING)
    private Vet vet;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}