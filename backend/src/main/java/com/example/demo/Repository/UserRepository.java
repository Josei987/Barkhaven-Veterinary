package com.example.demo.Repository;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * Repository interface for User entity operations.
 * Provides methods for accessing and manipulating user data in the database.
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Finds a user by their email address.
     * @param email
     * @return
     */
    Optional<User> findByEmail(String email); // make sure matches, make sure email already exists; Optional is name of util, <User> is reference to User Entity; this is so there is no pointer to null if the email is wrong or doesn't exist

}