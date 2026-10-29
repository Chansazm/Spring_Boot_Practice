package com.tight.coupling;

public class UserManager {
    //tightly coupled
    private UserDatabase userDatabase = new UserDatabase();

    public  String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
