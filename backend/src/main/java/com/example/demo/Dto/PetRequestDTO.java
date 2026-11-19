package com.example.demo.Dto;

public class PetRequestDTO { // everything being sent to us, response is when it's only what's necessary

    private String petName;

    private int age;

    private String weight;

    private String species;

    private String breed;

    private String gender;

    private String spayedOrNeutered;

    private String priorConditions;

    private String medications;

    private String notes;


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpayedOrNeutered() {
        return spayedOrNeutered;
    }

    public void setSpayedOrNeutered(String spayedOrNeutered) {
        this.spayedOrNeutered = spayedOrNeutered;
    }

    public String getPriorConditions() {
        return priorConditions;
    }

    public void setPriorConditions(String priorConditions) {
        this.priorConditions = priorConditions;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}