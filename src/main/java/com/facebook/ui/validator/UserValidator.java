package com.facebook.ui.validator;

import com.facebook.exception.FbEmailInvalid;
import com.facebook.exception.FbShortPasswordException;
import com.facebook.exception.FbStrongPasswordException;
import com.facebook.exception.FbTechnicalException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserValidator {

    public void validateUserCredentials(String email, String password) throws FbShortPasswordException, FbEmailInvalid, FbStrongPasswordException {
        // structural checks - length, format, strong password
        int ok1 = 0, ok2 = 0, ok3 = 0,ok4=0;
        if (password.length() < 5)
            throw new FbShortPasswordException();
        else {
            for (int i = 0; i < password.length(); i++)
                if (Character.isUpperCase(password.charAt(i)))
                    ok1++;
            for (int j = 0; j < password.length(); j++)
                if (Character.isLowerCase(password.charAt(j)))
                    ok2++;
            for (int k = 0; k < password.length(); k++)
                if (Character.isDigit(password.charAt(k)))
                    ok3++;
            Pattern p = Pattern.compile("[^A-Za-z0-9]");
            if(!p.matcher(password).matches())
                    ok4++;
            if (ok1 < 1 || ok2 < 1 || ok3 < 1 || ok4 < 1)
                throw new FbStrongPasswordException();
        }
        Pattern pattern=Pattern.compile("[a-zA-Z0-9-_$]+@[a-zA-Z0-9-_$]+\\.[a-zA-Z0-9-_$]{2,6}");
        if(!pattern.matcher(email).matches())
            throw new FbEmailInvalid();

        // throw new InvalidUserInputDateException();
    }
}
