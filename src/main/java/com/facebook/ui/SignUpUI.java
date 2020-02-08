package com.facebook.ui;

import com.facebook.exception.FacebookException;
import com.facebook.exception.FbEmailInvalid;
import com.facebook.exception.FbShortPasswordException;
import com.facebook.exception.FbTechnicalException;
import com.facebook.service.UserService;
import com.facebook.ui.validator.UserValidator;

import java.util.Scanner;

public class SignUpUI {

    private UserService userService = new UserService();
    private UserValidator userValidator=new UserValidator();

    public void displaySignUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
            try {
                userValidator.validateUserCredentials(email,password);
                userService.signUp(email, password);
                System.out.println("User successfully added");
            } catch (FbShortPasswordException e) {
                System.out.println("Password is too short");
            } catch (FbEmailInvalid e) {
                System.out.println("Email invalid");
            } catch (FbTechnicalException e) {
                e.printStackTrace();
                System.out.println("A system error appeared. Please contact your administrator");
            } catch (FacebookException e) {
                e.printStackTrace();
            }
    }
}
