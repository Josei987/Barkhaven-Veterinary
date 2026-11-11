package com.example.demo.Exceptions;
/**
 * Exception thrown when an email address is already in use.
 * EmailAlreadyExistsException
 */
public class EmailAlreadyExistsException extends RuntimeException {
    /**
     * 
     * @param message
     */
    public EmailAlreadyExistsException(String message){
        super(message);
    }
}