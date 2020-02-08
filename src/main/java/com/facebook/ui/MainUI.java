package com.facebook.ui;

import sun.rmi.runtime.Log;

public class MainUI {

    private LoginUI loginUI = new LoginUI();
    private SignUpUI signUpUI=new SignUpUI();

//    private SignUpUI signUpUI

    public void start() {
       // loginUI.displayLogin();
        signUpUI.displaySignUp();
    }

}
