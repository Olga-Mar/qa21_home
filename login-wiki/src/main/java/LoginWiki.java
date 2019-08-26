
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginWiki {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        //open site
        driver.get("https://en.wikipedia.org");
    }

  @Test
    public void LoginWiki() {
        //init login
        driver.findElement(By.id("pt-login")).click();
        // fill login  form
        driver.findElement(By.id("wpName1")).click();
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("hyjukkkpl@jilll.com");
        //fill password
        driver.findElement(By.id("wpPassword1")).click();
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("09876544L");

        // confirm login
        driver.findElement(By.name("wploginattempt")).click();
        driver.findElement(By.name("wploginattempt")).clear();
        driver.findElement(By.name("wploginattempt")).sendKeys("09876544L");

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();// zakryt browser
    }
}

