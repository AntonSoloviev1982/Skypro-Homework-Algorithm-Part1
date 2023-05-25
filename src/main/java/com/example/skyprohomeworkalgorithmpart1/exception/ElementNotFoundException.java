package com.example.skyprohomeworkalgorithmpart1.exception;

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException() {
    }

    public ElementNotFoundException(String message) {
        super(message);
    }
}
