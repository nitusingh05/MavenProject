package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {
    @BeforeMethod
    void beforeClass(){
        System.out.println("This will run before class");
    }
    @AfterMethod
    void afterClass(){
        System.out.println("This will run after class");
    }
    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will run before every method");
    }
    @AfterMethod
    void afterMethod() {
        System.out.println("This will run after every method");
    }
    @Test
    void test4(){
        System.out.println("This is test 4");
    }
    @Test
    void test5(){
        System.out.println("This is test 5");
    }
   @Test
    void test6(){
        System.out.println("This is test 6");
    }
}
