package com.example.demo.Repository;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository;JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository {

    Optional<User> findMyEmail(String email); // make sure matches, make sure email already exists; Optional is name of util, <User> is reference to User Entity; this is so there is no pointer to null if the email is wrong or doesn't exist

}