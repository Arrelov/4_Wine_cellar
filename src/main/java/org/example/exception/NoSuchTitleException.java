package org.example.exception;

//"No barrel with such label in the wine cellar"

public class NoSuchTitleException extends RuntimeException {
    public NoSuchTitleException(String message) {
        super(message);
    }
}
