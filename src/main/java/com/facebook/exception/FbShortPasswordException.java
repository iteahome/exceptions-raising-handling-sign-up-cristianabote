package com.facebook.exception;

public class FbShortPasswordException extends FbBusinessException {

    public FbShortPasswordException() {
    }

    public FbShortPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
