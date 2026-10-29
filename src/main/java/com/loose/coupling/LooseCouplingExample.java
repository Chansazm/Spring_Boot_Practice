package com.loose.coupling;


public class LooseCouplingExample {
    static void main() {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerwithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerwithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerwithNewDatabase = new UserManager(newDatabaseProvider);
        System.out.println(userManagerwithNewDatabase.getUserInfo());



    }
}
