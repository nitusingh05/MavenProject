package org.example;

import org.testng.annotations.*;


public class Test1 {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }
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
     void test1(){
        System.out.println("This is Test 1");
    }
    @Test
    void test2(){
        System.out.println("This is test 2");
    }
    @Test
    void test3(){
        System.out.println("This is test 3");
    }
}


