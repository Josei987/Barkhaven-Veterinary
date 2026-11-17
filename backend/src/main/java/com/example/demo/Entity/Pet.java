package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Entity class representing pets in the system.
 * Pet
 */
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petId;

    @ManytoOne(fetch = FetchType.LAZY, optional = false) // won't fill in until rest is done
    @JoinColumn(name = "firstName", nullable = false) // linking to user table and grabbing the owner name
    private User ownerName;

    @ManytoOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User ownerId;

    @Column (nullable = false)
    private String petName;

    @Column (nullable = false)
    private int age;

    @Column (nullable = false)
    private String weight; // String to account for unit they will add

    @Column (nullable = false)
    private String species;

    @Column (nullable = false)
    private String breed;

    @Column (nullable = false)
    private String gender;

    @Column (nullable = false)
    private String spayedOrNeutered;

    @Column (nullable = true)
    private String priorConditions;

    @Column (nullable = true)
    private String medications;

    @Column (nullable = true)
    private String notes;


    /**
     *
     * @return petId
     */
    public Long getPetId() {
        return petId;
    }

    /**
     *
     * @param petId
     */
    public void setPetId(Long petId) {
        this.petId = petId;
    }

    /**
     *
     * @return ownerName
     */
    public User getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param ownerName
     */
    public void setOwnerName(User ownerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @return ownerId
     */
    public User getOwnerId() {
        return ownerId;
    }

    /**
     *
     * @param ownerId
     */
    public void setOwnerId(User ownerId) {
        this.ownerId = ownerId;
    }

    /**
     *
     * @return petName
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     *
     * @return species
     */
    public String getSpecies() {
        return species;
    }

    /**
     *
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     *
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return spayedOrNeutered
     */
    public String getSpayedOrNeutered() {
        return spayedOrNeutered;
    }

    /**
     *
     * @param spayedOrNeutered
     */
    public void setSpayedOrNeutered(String spayedOrNeutered) {
        this.spayedOrNeutered = spayedOrNeutered;
    }

    /**
     *
     * @return priorConditions
     */
    public String getPriorConditions() {
        return priorConditions;
    }

    /**
     *
     * @param priorConditions
     */
    public void setPriorConditions(String priorConditions) {
        this.priorConditions = priorConditions;
    }

    /**
     *
     * @return medications
     */
    public String getMedications() {
        return medications;
    }

    /**
     *
     * @param medications
     */
    public void setMedications(String medications) {
        this.medications = medications;
    }

    /**
     *
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     *
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}