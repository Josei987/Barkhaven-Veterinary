package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Entity.Pet;
import com.example.demo.Repository.PetRepository;
import com.example.demo.Dto.PetRequestDTO;
import com.example.demo.Dto.PetResponseDTO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    public PetService(PetRepository petRepository) {

        this.petRepository = petRepository;

    }

    public PetResponseDTO addPet(PetRequestDTO petRequestDTO) {

        User owner = petRepository.findByOwnerEmail(String email).orElseThrow();

        Pet pet = new Pet;

        pet.setPetName(petRequestDTO.getPetName());

        pet.setPetAge(petRequestDTO.getAge());

        pet.setPetWeight(petRequestDTO.getWeight());

        pet.setPetSpecies(petRequestDTO.getSpecies());

        pet.setPetBreed(petRequestDTO.getBreed());

        pet.setPetGender(petRequestDTO.getGender());

        pet.setPetSpayedOrNeutered(petRequestDTO.getSpayedOrNeutered());

        pet.setPetPriorConditions(petRequestDTO.getPriorConditions());

        pet.setPetMedications(petRequestDTO.getMedications());

        pet.setPetNotes(petRequestDTO.getNotes());

        return new PetResponseDTO(petRepository.save(pet.getPetId(), pet.getPetName(), pet.getAge(), pet.getWeight(), pet.getSpecies(), pet.getBreed(), pet.getGender(), pet.getSpayedOrNeutered(), pet.getPriorConditions(), pet.getNotes()));

    }
}