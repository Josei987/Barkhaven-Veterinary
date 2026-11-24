package com.example.demo.Dto;

public class PetResponseDTO {

    private Long petId;

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

    public PetResponseDTO(Long petId, String petName, int age, String weight, String species, String breed, String gender, String spayedOrNeutered, String priorConditions, String medications, String notes) { // constructor

        this.petId = petId;

        this.petName = petName;

        this.age = age;

        this.weight = weight;

        this.species = species;

        this.breed = breed;

        this.gender = gender;

        this.spayedOrNeutered = spayedOrNeutered;

        this.priorConditions = priorConditions;

        this.medications = medications;

        this.notes = notes;

    }

    public Long getPetId() {
        return petId;
    }

    public String getPetName() {
        return petName;
    }

    public int getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getSpayedOrNeutered() {
        return spayedOrNeutered;
    }

    public String getPriorConditions() {
        return priorConditions;
    }

    public String getMedications() {
        return medications;
    }

    public String getNotes() {
        return notes;
    }

}