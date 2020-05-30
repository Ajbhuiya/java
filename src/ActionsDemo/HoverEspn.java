package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HoverEspn {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.espn.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(5000);
        WebElement hamburg = driver.findElement(By.xpath("//nav[@id='global-nav']/ul/li[1]/a/span/span[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(hamburg).build().perform();
        WebElement ham2 = driver.findElement(By.className("index desktop page-context-top prod"));
        act.moveToElement(ham2).click().build().perform();







        /*WebElement search = driver.findElement(By.xpath("//a[@id='global-search-trigger' and @class='icon-font-after icon-search-solid-after']"));
        search.click();
        driver.findElement(By.className("search-box")).sendKeys("lebron", Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        driver.navigate().back();
        Actions act = new Actions(driver);
        WebElement hamBurg = driver.findElement(By.xpath("//*[@id=\"global-nav\"]/ul/li[8]/a"));
        act.moveToElement(hamBurg).build().perform();
        Thread.sleep(5000);

        act.moveToElement(driver.findElement(By.linkText("New York"))).click().build().perform();*/








    }
}