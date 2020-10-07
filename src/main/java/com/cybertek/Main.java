package com.cybertek;

import com.cybertek.oop.encapsulation.User;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello!");
        User user = new User();
        user.setUserName("Ozzy");
        System.out.println(user.getUserName());
    }
}
