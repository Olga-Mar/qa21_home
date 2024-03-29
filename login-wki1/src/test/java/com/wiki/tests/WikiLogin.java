package com.wiki.tests;

import com.wiki.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiLogin extends TestBase {
    @BeforeMethod
    public void preconditions(){
        if(!app.getSession().isElementPresent(By.id("pt-login"))){
            app.getSession().openSite("https://en.wikipedia.org");
        }
    }

    @Test
    public void WikiLogin() {
        app.getSession().initLogin();
        app.getSession().fillLoginForm("ghjhgjgjh@jhjhjhk.com", "123455678G");
        app.getSession().confirmLogin();
    }

    @AfterMethod
    public void postActions(){
        app.getSession().openSite("https://en.wikipedia.org");
    }


}


