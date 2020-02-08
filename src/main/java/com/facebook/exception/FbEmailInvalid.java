package com.facebook.exception;

public class FbEmailInvalid extends FbBusinessException {
    public FbEmailInvalid() {
    }

    public FbEmailInvalid(String message, Throwable cause) {
        super(message, cause);
    }
}
