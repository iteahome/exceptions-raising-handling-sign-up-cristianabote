package com.facebook.exception;

public class FbStrongPasswordException extends FbBusinessException {
    public FbStrongPasswordException(){
    }
    public FbStrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}

