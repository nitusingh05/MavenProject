package org.example;

import org.testng.annotations.Test;

public class classTest {
    @Test(groups = "critical;")
    void Google(){
        System.out.println("www.google.com");
    }
    @Test(groups = "regression;")
    void googleHomePage(){
        System.out.println("googleHomePage");
    }
    @Test(groups = "critical;")
    void googleSearch(){
        System.out.println("googleSearch");
    }
    @Test(groups = "regression;")
    void googleFunction(){
        System.out.println("googleFunction");
    }
}
