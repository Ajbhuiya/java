package Practice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Calendar {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver= new ChromeDriver();
        baseUrl="https://www.expedia.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void calender() throws InterruptedException {
        driver.get(baseUrl);
        // Click flights tab
        driver.findElement(By.id("hotel-checkin-hp-hotel")).click();
        Thread.sleep(3000);
        // Find the date to be selected
        WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//a[text()='29'"));
        // Click the date
        dateToSelect.click();
        Thread.sleep(3000);
    }
//*[@id="hotel-checkin-wrapper-hp-hotel"]/div/div/div[2]/table/tbody/tr[5]/td[5]/button
    }

