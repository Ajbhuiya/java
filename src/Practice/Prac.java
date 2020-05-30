package Practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Prac {

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
        driver.get("http://www.youtube.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bangla");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//yt-formatted-string[text()='ব্যথা লাগার গান (The Boo Boo Song) + More Bangla Rhymes for Children - ChuChu TV']")).click();
        Thread.sleep(3000);










    }

    @After
    public void end() {
        driver.quit();


    }
}

