package Practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioNCheckBox {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
     @Test
    public void test() throws InterruptedException {
         WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
         bmwRadioBtn.click();

         Thread.sleep(2000);
         WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
         benzRadioBtn.click();

         WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
         bmwCheckBox.click();

         System.out.println(bmwCheckBox.isSelected());
         System.out.println(benzRadioBtn.isSelected());
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
