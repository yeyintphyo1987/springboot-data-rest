package com.yyp.springbootrest.service;

public class UserNumberNotFoundException extends RuntimeException {
    public UserNumberNotFoundException(String message) {
        super(message);
    }
}