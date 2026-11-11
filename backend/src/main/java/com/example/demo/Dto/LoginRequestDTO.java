package com.example.demo.Dto;
/**
 * Data Transfer Object for login requests.
 * LoginRequestDTO
 */
public class LoginRequestDTO {

    private String email;
    private String password;

    /**
     * Gets the email address.
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password.
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
