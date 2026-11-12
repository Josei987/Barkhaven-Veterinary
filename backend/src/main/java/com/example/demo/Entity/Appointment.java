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

/**
 * Entity class representing appointments in the system.
 * Appointment
 */
@Entity
public class Appointment { // generate appointment id with random

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long apptID;

    @Column (nullable = false)
    private String ownerName;

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

    /**
     *
     * @return Long
     */
    public Long getApptID() {
        return apptID;
    }

    /**
     *
     * @param apptID
     */
    public void setApptID(Long apptID) {
        this.apptID = apptID;
    }

    /**
     *
     * @return String
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @return String
     */
    public String getPetName() {
        return petName;
    }

    /**
     *
     * @param petName
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     *
     * @return String
     */
    public String getPetBreed() {
        return petBreed;
    }

    /**
     *
     * @param petBreed
     */
    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    /**
     *
     * @return String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return LocalDate
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     *
     * @return LocalTime
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     *
     * @param time
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     *
     * @return String
     */
    public String getReason() {
        return reason;
    }

    /**
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     *
     * @return ApptStatus
     */
    public ApptStatus getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(ApptStatus status) {
        this.status = status;
    }

    /**
     *
     * @return PetType
     */
    public PetType getPetType() {
        return petType;
    }

    /**
     *
     * @param petType
     */
    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    /**
     *
     * @return ApptType
     */
    public ApptType getApptType() {
        return apptType;
    }

    /**
     *
     * @param apptType
     */
    public void setApptType(ApptType apptType) {
        this.apptType = apptType;
    }

    /**
     *
     * @return Vet
     */
    public Vet getVet() {
        return vet;
    }

    /**
     *
     * @param vet
     */
    public void setVet(Vet vet) {
        this.vet = vet;
    }

}