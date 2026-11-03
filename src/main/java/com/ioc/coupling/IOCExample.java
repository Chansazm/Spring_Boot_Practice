package com.ioc.coupling;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");

        //UserDataProvider databaseProvider = new UserDatabaseProvider();
        //UserManager userManagerWithDB = new UserManager(databaseProvider);
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());


        //UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        //UserManager userManagerwithNewDatabase = new UserManager(newDatabaseProvider);
        UserManager userManagerwithNewDatabase = (UserManager) context.getBean("userManagerWithNewDataProvider");
        System.out.println(userManagerwithNewDatabase.getUserInfo());


        //UserDataProvider webServiceProvider = new WebServiceDataProvider();
        //UserManager userManagerwithWS = new UserManager(webServiceProvider);
        UserManager userManagerwithWS = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManagerwithWS.getUserInfo());


    }
}
