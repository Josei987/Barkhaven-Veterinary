package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
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
    String petName;
    @Column (nullable = false)
    String petBreed;
    @Column (nullable = false)
    String phoneNumber;
    @Column (nullable = false)
    String email;
    @Column (nullable = false)
    LocalDate date;
    @Column (nullable = false)
    LocalTime time;
    @Column (nullable = false)
    String reason;

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