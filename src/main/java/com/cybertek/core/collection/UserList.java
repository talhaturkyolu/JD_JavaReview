package com.cybertek.core.collection;

import com.cybertek.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    public static List<User> createUserList(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User("Mike","Smith"));
        userList.add(new User("Tom","Pally"));
        return userList;

    }
}
