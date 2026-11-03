package com.loose.coupling;

public class Payment_DataBase implements UserDataProvider{
    void printUserinfo(){
        System.out.println("@@@says hello");
    }

    @Override
    public String getUserDetails() {
        return "Payment was successful ";
    }
}
