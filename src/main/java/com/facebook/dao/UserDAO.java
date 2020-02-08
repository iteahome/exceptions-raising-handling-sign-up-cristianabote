package com.facebook.dao;

import com.facebook.exception.FacebookException;
import com.facebook.exception.FbFileException;
import com.facebook.exception.FbTechnicalException;
import com.facebook.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAO {

    private static final String USERS_FILE = "c:\\JAVA\\proiecte\\exceptions-raising-handling-sign-up-cristianabote\\src\\main\\java\\users.txt";

    public List<User> readAllUsers() throws FbTechnicalException {
        List<User> userList = new ArrayList<>();
        Scanner scannerText=null;
        try {
            scannerText=new Scanner(new BufferedReader(new FileReader(USERS_FILE)));
            String userLine="";
            while(scannerText.hasNextLine()){
                    userLine = scannerText.nextLine();
            String[] userValues = userLine.split(";");

            userList.add(new User(userValues[0], userValues[1]));
            }
        } catch (IOException e) {
            throw new FbFileException("Error reading users", e);
        }

        return userList;
    }
    public void writeUser(User newUser)throws FbTechnicalException{
        System.out.println("scriu in fisier user nou:"+newUser.getEmail()+";"+newUser.getPassword());

    }
}
