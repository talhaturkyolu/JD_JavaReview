package com.cybertek;

import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatements;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;


public class Main {
    public static void main(String[] args) {

        //*******CORE*******//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(6));
        Methods.methodC();

        Loops.demoForIterator();
        Loops.demoForEach();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        //*******OOP-Encapsulation*******//
        User user = new User("Mike","Smith",new Role(2,"Manager"));
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());








    }

}
