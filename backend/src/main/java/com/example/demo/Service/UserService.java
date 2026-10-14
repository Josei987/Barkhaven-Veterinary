package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Dto.UserResponseDTO;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.Dto.UserRequestDTO;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    //creates account and returns to the UserResponseDTO
    public UserResponseDTO createAccount(User user){
        //checks if the email already exists and throws exception if so
        if(userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException("There is already an account created with this email address");
        }

        public UserRequestDTO logIn(LoginRequestDTO logInRequestDTO) {
            if(userRepository.findByEmail(logInRequestDTO.getEmail())) {
                .orElseThrow(() -> new RuntimeException("The email or password is incorrect"));
            }

            boolean passwordMatches = passwordEncoder.match(PasswordRequestDTO.getPassword(), user.getPassowrd());

            if(!passwordMatches) {
                new RuntimeException("Email or password is incorrect");
            }

            return new UserResponseDTO(saved.getUserId(), saved.getFirstName(), saved.get.LastName(), saved.getphoneNumber(), saved.getEmail());
        }

        //hashes the password and sets it as password in table
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);

        //saves to userRepository to write to table
        User saved = userRepository.save(user);
        
        //return the data we want the frontend to see
        //to the UserResponseDTO
        return new UserResponseDTO(saved.getUserId(), saved.getFirstName(), saved.getLastName(), saved.getPhoneNumber(), saved.getEmail());
    }
}
