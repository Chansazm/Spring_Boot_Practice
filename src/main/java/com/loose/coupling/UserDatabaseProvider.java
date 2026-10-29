package com.loose.coupling;

//A - MySQL, PostgreSQL
//B - Web Service , MongoDB
public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails(){
        return "User Details from database";
    }
}
