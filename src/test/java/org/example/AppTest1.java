package org.example;

import org.testng.annotations.Test;

public class AppTest1 {
    @Test(priority = 1)
    void Method1()
    {
        System.out.println("Method1");
    }
    @Test(priority = 2)
    void Method2()
    {
        System.out.println("Method2");
    }
    @Test(priority = 3)
    void Method3() {
        System.out.println("Method3");
    }
}
