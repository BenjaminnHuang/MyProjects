package com.example.psycologyapp;

public class Administrator {

    private String userName, userPassword;

    public Administrator(String name, String password) {
        setUserName(name);
        setUserPassword(password);
    }


    public String getName() {
        return userName;
    }


    public String getUserPassword() {
        return userPassword;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }


}
