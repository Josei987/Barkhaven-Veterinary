package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Dto.UserResponseDTO;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.Dto.LoginRequestDTO;
import com.example.demo.Exceptions.EmailAlreadyExistsException;
import com.example.demo.Exceptions.InvalidCredentialsException;

import java.util.Optional;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    //creates account and returns to the UserResponseDTO
    public UserResponseDTO createAccount(User user) {
        //checks if the email already exists and throws exception if so
        if(userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new EmailAlreadyExistsException("There is already an account created with this email address");
        }

        //hashes the password and sets it as password in table
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);

        //saves to userRepository to write to table
        //User saved = userRepository.save(user);

        //return the data we want the frontend to see
        //to the UserResponseDTO
        //return new UserResponseDTO(saved.getUserId(), saved.getFirstName(), saved.getLastName(), saved.getPhoneNumber(), saved.getEmail());
        return toDto(userRepository.save(user));
    }

    //var varName = 
    public UserResponseDTO logIn(LoginRequestDTO loginRequestDTO) {
        //if (userRepository.findByEmail(loginRequestDTO.getEmail())) {
        //    .orElseThrow(() -> new RuntimeException("The email or password is incorrect"));
        //}

        User user = userRepository.findByEmail(loginRequestDTO.getEmail()).orElseThrow(() -> new InvalidCredentialsException("Email or Password is incorrect."));

        boolean passwordMatches = passwordEncoder.matches(loginRequestDTO.getPassword(), user.getPassword());

        if (!passwordMatches) {
            throw new InvalidCredentialsException("Email or Password is incorrect");
        }

        return toDto(user);
        // return new UserResponseDTO(user.getUserId(), user.getFirstName(), user.getLastName(), user.getPhoneNumber(), user.getEmail());
    }

    public UserResponseDTO getbyEmail(String email){
        User user = userRepository.findByEmail(email)
            .orElseThrow(() -> new InvalidCredentialsException("Account not found."));
        return toDto(user);
    }

    public UserResponseDTO toDto(User user){
        return new UserResponseDTO(user.getUserId(), user.getFirstName(), user.getLastName(), user.getPhoneNumber(), user.getEmail());
    }

}
