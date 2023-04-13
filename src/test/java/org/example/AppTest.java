package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test(priority = 1)
    void openBrowser()
    {
        System.out.println("Opening Browser");
    }
    @Test(priority = 2)
    void clickUMS()
    {
        System.out.println("Clicking on UMS");
    }
    @Test(priority = 3)
    void openHomePage()
    {
        System.out.println("Opening Home Page");
    }
    @Test(priority = 4,enabled = false)
    void closeUMS()
    {
        System.out.println("Closing UMS");
    }
    @Test(priority = 5,enabled = false)
    void closeBrowser()
    {
        System.out.println("Closing Browser");
    }
}