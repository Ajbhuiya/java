package alert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Popup {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link' and contains(text(),'Practice')]")).click();
        Thread.sleep(3000);













    }

    @After
    public void end() {
        driver.quit();


    }
}

