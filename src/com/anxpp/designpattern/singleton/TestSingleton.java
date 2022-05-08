package com.anxpp.designpattern.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        ThreadLocalSingleton instance1= ThreadLocalSingleton.getInstance();
        System.out.println("单例1： " + instance1.toString());
        ThreadLocalSingleton instance2= ThreadLocalSingleton.getInstance();
        System.out.println("单例2： " + instance2.toString());
    }
}
