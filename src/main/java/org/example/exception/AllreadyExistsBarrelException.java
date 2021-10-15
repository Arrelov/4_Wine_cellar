package org.example.exception;

public class AllreadyExistsBarrelException extends RuntimeException{
    public String allreadyExistsBarrelException(String message) {
        return "Such barrel is allready exists in wine cellar";
    }
}
