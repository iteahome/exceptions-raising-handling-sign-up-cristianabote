package com.facebook.ui;

import sun.rmi.runtime.Log;

import java.io.IOException;

public class MainUI {

    private LoginUI loginUI = new LoginUI();
    private SignUpUI signUpUI=new SignUpUI();

//    private SignUpUI signUpUI

    public void start() throws IOException {
       // loginUI.displayLogin();
        signUpUI.displaySignUp();
    }

}
