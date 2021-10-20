package org.example.exception;
// "Such barrel is already exists in wine cellar"

public class AlreadyExistsBarrelException extends RuntimeException {
    public AlreadyExistsBarrelException(String message) {
        super(message);
    }
}
