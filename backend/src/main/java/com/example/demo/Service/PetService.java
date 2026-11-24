package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Entity.Pet;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.PetRepository;
import com.example.demo.Dto.PetRequestDTO;
import com.example.demo.Dto.PetResponseDTO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    
    private final UserRepository userRepository;
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository, UserRepository userRepository) {

        this.petRepository = petRepository;
        this.userRepository = userRepository;

    }

    public PetResponseDTO addPet(PetRequestDTO petRequestDTO, String ownerEmail) {

        User owner = userRepository.findByEmail(ownerEmail).orElseThrow();

        Pet pet = new Pet();

        pet.setOwner(owner);
        
        pet.setPetName(petRequestDTO.getPetName());

        pet.setAge(petRequestDTO.getAge());

        pet.setWeight(petRequestDTO.getWeight());

        pet.setSpecies(petRequestDTO.getSpecies());

        pet.setBreed(petRequestDTO.getBreed());

        pet.setGender(petRequestDTO.getGender());

        pet.setSpayedOrNeutered(petRequestDTO.getSpayedOrNeutered());

        pet.setPriorConditions(petRequestDTO.getPriorConditions());

        pet.setMedications(petRequestDTO.getMedications());

        pet.setNotes(petRequestDTO.getNotes());

        Pet saved = petRepository.save(pet);
        return new PetResponseDTO(saved.getPetId(), saved.getPetName(), saved.getAge(), saved.getWeight(), saved.getSpecies(), saved.getBreed(), saved.getGender(), saved.getSpayedOrNeutered(), saved.getPriorConditions(), saved.getMedications(), saved.getNotes());

    }

    public List<PetResponseDTO> getMyPet(String ownerEmail) {
        //finsd the owner's pet through the findByOwnerEmail method and stores all of it as a list. 
        return petRepository.findByOwnerEmail(ownerEmail).stream()
            .map(p -> new PetResponseDTO(p.getPetId(), p.getPetName(), p.getAge(), p.getWeight(), p.getSpecies(), p.getBreed(), p.getGender(), p.getSpayedOrNeutered(), p.getPriorConditions(), p.getMedications(), p.getNotes()))
            .toList();
    } 
}