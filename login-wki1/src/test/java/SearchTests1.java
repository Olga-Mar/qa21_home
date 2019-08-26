import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class SearchTests1 extends TestBase {


    @Test
    public void searchWikiTestJava() throws InterruptedException {

        //search and type java

        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");

        //start search

        click(By.name("go"));

        //pause
    }

    @Test
    public void searchWikiTestQA() {

        //search and type qa

        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("QA");

        //start search

        click(By.name("go"));


    }


    //alt+enter- podgrugaet import, esli est krasnoe
    // ctr+spas stavim posle to4ki-avtoprodoljaem
    //ctr+d= dubliruet stroku


}
