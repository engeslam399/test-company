package com.example.testcompany.exception;

public class EmployeeAlreadyExists extends RuntimeException{
    public EmployeeAlreadyExists(String message) {
        super(message);
    }
}
