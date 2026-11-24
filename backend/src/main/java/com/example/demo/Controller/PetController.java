package com.example.demo.Controller;

import com.example.demo.Service.PetService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Pet;
import com.example.demo.Dto.PetRequestDTO;
import org.springframework.security.core.Authentication;
import com.example.demo.Dto.PetResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.List;


@RestController 
@RequestMapping("/api/pets") 
public class PetController {
    
    private final PetService petService;

    public PetController(PetService petService){
        this.petService = petService;
    }

    @PostMapping
    public ResponseEntity<PetResponseDTO> addPet(@RequestBody PetRequestDTO petRequestDTO, Authentication auth){
        
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.addPet(petRequestDTO, auth.getName()));
    }
    
}
