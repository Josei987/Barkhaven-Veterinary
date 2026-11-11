package com.example.demo.Exceptions;

/**
 * Exception thrown when invalid credentials are provided.
 */
public class InvalidCredentialsException extends RuntimeException {
    
    /**
     * Constructs an InvalidCredentialsException with the specified detail message.
     *
     * @param message the detail message
     */
    public InvalidCredentialsException(String message){
        super(message);
    }
}