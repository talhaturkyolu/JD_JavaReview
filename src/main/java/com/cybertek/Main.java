package com.cybertek;

import com.cybertek.core.Methods;

public class Main {
    public static void main(String[] args) {

        //*******CORE*******//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(6));
        Methods.methodC();




    }

}
