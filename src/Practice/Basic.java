package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Basic {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\firoz_000\\Downloads\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.yahoo.com");
        driver.findElement(By.cssSelector("input[id$='search-input']")).sendKeys("google");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#header-desktop-search-button>svg")).click();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();


        driver.quit();


    }
}