package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Emirates {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.emirates.com");
        Thread.sleep(3000);
        WebElement from = driver.findElement(By.xpath("//input[@name='Departure Airport']"));
        from.click();
        from.clear();
        from.sendKeys("JFK", Keys.TAB);
        WebElement to = driver.findElement(By.xpath("//input[@name='Arrival Airport']"));
        to.sendKeys("Dhaka");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        driver.findElement(By.xpath("//div[@class='textfield__date textfield__date--first']//label[text()='Departing' and @class='textfield__label']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("28")).click();
        driver.findElement(By.linkText("28")).click();
        driver.findElement(By.xpath("//span[text()='Search flights']")).click();




        }
        }