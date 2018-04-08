package com.liwei2018.liwei0403;

/**
 * Created by dell on 2018/4/3.
 */
public class SingletonTest {

    private static SingletonTest singletonTest = new SingletonTest();

    private SingletonTest() {

    }

    public static SingletonTest getSingletonTest(){
        return singletonTest;
    }
}
