package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CalendarDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com/?pwaLob=wizard-flight-pwa");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Click flights tab
        //driver.findElement(By.className("tab-flight-tab")).click();
        // Find departing field
        WebElement departingField = driver.findElement(By.id("d1-btn"));
        // Click departing field
        departingField.click();
        Thread.sleep(3000);
        // Find the date to be selected
        WebElement dateToSelect = driver.findElement(By.cssSelector("#hotel-checkin-wrapper-hp-hotel > div > div > div:nth-child(4) > table > tbody > tr:nth-child(5) > td:nth-child(5) > button"));
        // Click the date
        dateToSelect.click();
        Thread.sleep(3000);








    }
}
