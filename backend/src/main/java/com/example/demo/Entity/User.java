package com.example.demo.Entity;

import jakarta.persistence.Entity;
// import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
//import jakarta.persistence.EnumType;
// import java.time.LocalDate;
// import java.time.LocalTime;

/**
 * Entity class representing a user in the system.
 * User
 */
@Entity
@Table(name = "users")
public class User {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String streetAddress;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String emergencyContactName;

    @Column(nullable = false)
    private String emergencyContactNumber;

    /** 
     * @return Long
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /** 
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /** 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /** 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** 
     * @return String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /** 
     * @return String
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /** 
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /** 
     * @return String
     */
    public String getState(){
        return state;
    }

    /** 
     * @param state
     */
    public void setState(String state){
        this.state = state;
    }

    /** 
     * @return String
     */
    public String getCity(){
        return city;
    }

    /** 
     * @param city
     */
    public void setCity(String city){
        this.city = city;
    }

    /** 
     * @return String
     */
    public String getZipCode(){
        return zipCode;
    }

    /** 
     * @param zipCode
     */
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    /** 
     * @return String
     */
    public String getEmergencyContactName(){
        return emergencyContactName;
    }

    /** 
     * @param emergencyContactName
     */
    public void setEmergencyContactName(String emergencyContactName){
        this.emergencyContactName = emergencyContactName;
    }

    /** 
     * @return String
     */
    public String getEmergencyContactNumber(){
        return emergencyContactNumber;
    }

    /** 
     * @param emergencyContactNumber
     */
    public void setEmergencyContactNumber(String emergencyContactNumber){
        this.emergencyContactNumber = emergencyContactNumber;
    }

}