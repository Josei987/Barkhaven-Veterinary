package com.example.demo.Dto;

/**
 * Data Transfer Object for user response.
 * UserResponseDTO
 */
public class UserResponseDTO {
    
    private Long userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    /**
     * Creates a new UserResponseDTO instance.
     * @param userId
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param email
     */
    public UserResponseDTO(Long userId, String firstName, String lastName, String phoneNumber, String email){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /** 
     * @return Long
     */
    public Long getUserId(){
        return userId;
    }

    /** 
     * @return String
     */
    public String getFirstName(){
        return firstName;
    }

    /** 
     * @return String
     */
    public String getLastName(){
        return lastName;
    }

    /** 
     * @return String
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    /** 
     * @return String
     */
    public String getEmail(){
        return email;
    }
}
