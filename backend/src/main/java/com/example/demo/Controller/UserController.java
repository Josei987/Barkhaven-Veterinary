package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.demo.Dto.UserResponseDTO;
import com.example.demo.Dto.LoginRequestDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.context.SecurityContext;
import java.util.List;

/**
 * Controller for handling user authentication-related requests.
 * UserController
 */
@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins="*")
public class UserController {
    private final UserService userService;
    private final SecurityContextRepository securityContextRepository;

    /**
     * 
     * @param userService
     * @param securityContextRepository
     */
    public UserController(UserService userService, SecurityContextRepository securityContextRepository) {
        this.userService = userService;
        this.securityContextRepository = securityContextRepository;
        
    }

    /** 
     * Creates a new user account.
     * @param user
     * @return ResponseEntity<UserResponseDTO>
     */
    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> createAccount(@RequestBody User user) {
        UserResponseDTO saved = userService.createAccount(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(saved);

    }

    /**
     * Logs in a user.
     * @param loginRequestDTO
     * @param request
     * @param response
     * @return ResponseEntity<UserResponseDTO>
     */
    @PostMapping("/login")
    public ResponseEntity<UserResponseDTO> logIn(@RequestBody LoginRequestDTO loginRequestDTO, HttpServletRequest request, HttpServletResponse response) {
        UserResponseDTO user = userService.logIn(loginRequestDTO);

        //create a new session on request after checking login credentials
        request.getSession(true);
        request.changeSessionId(); //once newly created session is made, we change the session id to a new one. 

        Authentication authenticate = new UsernamePasswordAuthenticationToken(user.getEmail(), null, List.of(new SimpleGrantedAuthority("ROLE_USER")));

        SecurityContext context = SecurityContextHolder.createEmptyContext();
        context.setAuthentication(authenticate);
        securityContextRepository.saveContext(context, request, response);

        return ResponseEntity.ok(user);

    }

    /** 
     * Retrieves the current user's information.
     * @param authenticate
     * @return ResponseEntity<UserResponseDTO>
     */
    @GetMapping("/me")
    public ResponseEntity<UserResponseDTO> findByEmail(Authentication authenticate){
        return ResponseEntity.ok(userService.getbyEmail(authenticate.getName()));
    }

    /** 
     * Logs out the current user.
     * @param request
     * @return ResponseEntity<UserResponseDTO>
     */
    @PostMapping("/logout")
    public ResponseEntity<UserResponseDTO> logOut(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session != null){
            session.invalidate();
        }
        SecurityContextHolder.clearContext();
        return ResponseEntity.noContent().build();
    }
}
