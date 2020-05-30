package Practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestdropDown {

    WebDriver driver;
    String baseUrl;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver= new ChromeDriver();
        baseUrl="https://learn.letskodeit.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Test
    public void test() throws InterruptedException {
        driver.get(baseUrl);
       /*WebElement element = driver.findElement(By.id("carselect"));//32 and 33 can be written  either way
       // Select sel = new Select(driver.findElement(By.id("carselect")));
        Select sel = new Select(element);*/

        /*Thread.sleep(2000);
        System.out.println("select benz by value");
        sel.selectByValue("value");*/
        driver.findElement(By.xpath("//select[@id='carselect']//option[@value='benz']")).click();
        Thread.sleep(2000);




    }
    @After
    public void end(){

    }

}
