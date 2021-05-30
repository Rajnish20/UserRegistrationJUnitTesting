package com.magic.exception;

public class UserRegistrationException extends Exception {
    public enum ExceptionType {
        Entered_Null, Entered_Empty, Entered_Short,Entered_INVALID
    }

    public ExceptionType type;

    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
