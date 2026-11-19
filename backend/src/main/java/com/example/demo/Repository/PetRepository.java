package com.example.demo.Repository;

import com.example.demo.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByOwnerEmail(String email); // using to find owner email; find is operation, by is filter, owner points to user table, email is the thing in that table being searched for

}

