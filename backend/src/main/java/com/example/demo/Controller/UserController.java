package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.example.demo.Dto.UserResponseDTO;
import com.example.demo.Dto.PasswordRequestDTO;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins="*")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> createAccount(@RequestBody User user) {
        UserResponseDTO saved = userService.createAccount(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(saved);

    }

    @PostMapping("/logIn")
    public ResponseEntity<UserResponseDTO> logIn(@RequestBody LogInRequestDTO logInRequestDTO) {
        UserResponseDTO saved = userService.logIn(logInRequestDTO);

        return responseEntity.status.(HttpStatus.OK).body(saved);

    }

}
