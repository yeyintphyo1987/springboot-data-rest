package com.yyp.springbootrest.service;

public class VoucherNotFoundException extends RuntimeException {
    public VoucherNotFoundException(String message) {
        super(message);
    }
}