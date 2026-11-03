package com.loose.coupling;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorinjection.xml");


        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerwithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerwithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerwithNewDatabase = new UserManager(newDatabaseProvider);
        System.out.println(userManagerwithNewDatabase.getUserInfo());

        UserDataProvider paymentDataBase = new Payment_DataBase();
        UserManager paymentDataBaseWithUserManager = new UserManager(paymentDataBase);




    }
}
