package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SlidersDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\firoz_000\\Downloads\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.jqueryui.com/slider/");

        driver.switchTo().frame(0);//only in this website
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//div[@id=\"slider\"]/span"));
        Actions act = new Actions(driver);
        act.dragAndDropBy(element,500,0).perform();
        driver.quit();






        //find element for slider



    }
}
