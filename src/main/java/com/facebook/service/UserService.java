package com.facebook.service;

import com.facebook.dao.UserDAO;
import com.facebook.exception.FacebookException;
import com.facebook.exception.FbTechnicalException;
import com.facebook.exception.FbWrongCredentialsException;
import com.facebook.model.User;

import java.io.IOException;
import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public User login(String inputEmail, String inputPassword) throws FacebookException {
        for (User user: userDAO.readAllUsers()) {
            if (inputEmail.equals(user.getEmail()) && inputPassword.equals(user.getPassword())) {
                return user;
            }
        }

        throw new FbWrongCredentialsException();
    }

    public void signUp(String email, String password) throws FacebookException, IOException {
            User user = new User(email, password);
            userDAO.writeUser(user);
    }
}
