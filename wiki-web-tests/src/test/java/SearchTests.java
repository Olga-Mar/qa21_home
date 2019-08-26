import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchTests {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        //open site
        driver.get("https://en.wikipedia.org");
    }

    @Test
    public void searchWikiTestJava() throws InterruptedException {

        //search and type java

        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");

        //start search

        driver.findElement(By.name("go")).click();

        //pause
    }
   @Test
        public void searchWikiTestQA() {

            //search and type qa

            driver.findElement(By.name("search")).click();
            driver.findElement(By.name("search")).clear();
            driver.findElement(By.name("search")).sendKeys("QA");

            //start search

            driver.findElement(By.name("go")).click();



        }
        @AfterClass
        public void tearDown ()throws InterruptedException {
            Thread.sleep(6000);
            driver.quit();// zakryt browser

        }

        //alt+enter- podgrugaet import, esli est krasnoe
        // ctr+spas stavim posle to4ki-avtoprodoljaem
        //ctr+d= dubliruet stroku


    }

