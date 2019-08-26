import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class WikiLogin extends TestBase {

    @Test
    public void LoginWiki() {
        //init login
        click(By.id("pt-login"));
        // fill login  form
        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("hyjukkkpl@jilll.com");
        //fill password
        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("09876544L");

        // confirm login
        click(By.name("wploginattempt"));
        driver.findElement(By.name("wploginattempt")).clear();
        driver.findElement(By.name("wploginattempt")).sendKeys("09876544L");

    }


}


