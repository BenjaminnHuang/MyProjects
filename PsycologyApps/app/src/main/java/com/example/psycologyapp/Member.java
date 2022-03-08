package com.example.psycologyapp;

public class Member {

    private String userName, userPhone, userEmail, userAddress;

    public Member(String name, String userPhone, String userEmail, String userAddress) {
        setUserName(name);
        setUserPhone(userPhone);
        setUserEmail(userEmail);
        setUserAddress(userAddress);
    }


    public String getName() {
        return userName;
    }

    public String getPhone() {
        return userPhone;
    }

    public String getEmail() {
        return userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
