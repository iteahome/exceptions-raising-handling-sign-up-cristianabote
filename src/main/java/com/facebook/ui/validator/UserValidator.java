package com.facebook.ui.validator;

import com.facebook.exception.FbEmailInvalid;
import com.facebook.exception.FbShortPasswordException;
import com.facebook.exception.FbTechnicalException;


public class UserValidator {

    public void validateUserCredentials(String email, String password) throws FbShortPasswordException, FbEmailInvalid {
        // structural checks - length, format, strong password
            if (password.length() < 5)
                throw new FbShortPasswordException();
            if (!email.contains("@"))
                throw new FbEmailInvalid();

        // throw new InvalidUserInputDateException();
    }
}
