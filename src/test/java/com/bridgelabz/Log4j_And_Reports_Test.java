package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Log4j_And_Reports_Test extends Base{
    @Test
    public void login() throws InterruptedException{
        Login login = new Login(driver);
        login.login();
        Logout logout= new Logout(driver);
        String actualTitle = logout.logout();

        String expectedTitle = "LinkedIn: Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Login Successfull..!");
    }
    //allure serve allure-results


}
