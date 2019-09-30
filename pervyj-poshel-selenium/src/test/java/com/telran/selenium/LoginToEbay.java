package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void logInTest() {
        driver.get("https://www.ebay.com");
        //init login???
        //click(By.id("gh-ug"));
        initLogin();

       // fillLofinForm( )
        //fill login forme
        type(By.id("userid"), "adhggfk@jhdgfg.com");
        type(By.id("pass"), "123456789");

       // click(By.id("pass"));
       // driver.findElement(By.id("pass")).clear();
        //driver.findElement(By.id("pass")).sendKeys("123456789");

        click(By.id("sgnBt"));
        //



    }

    public void initLogin(){
        click(By.id("gh=ug"));
    }

    //  public void type(By locator, String text) {
    //  click(locator);
    //  driver.findElement(locator).clear();
    //  driver.findElement(locator).sendKeys(text);
}

// public void click(By locator) {
//    driver.findElement(locator).click();
// }


