package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightClickDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\firoz_000\\Downloads\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions act = new Actions(driver);

        WebElement click = driver.findElement(By.cssSelector(".context-menu-one"));
        Thread.sleep(5000);
        act.contextClick(click).build().perform();
        WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        String copyText = copy.getText();
        System.out.println(copyText);
        copy.click();


        Thread.sleep(5000);
        driver.quit();


















        /*driver.manage().window().maximize();
        Actions act = new Actions(driver);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement one =driver.findElement(By.cssSelector(".context-menu-one"));
        act.contextClick(one).build().perform();
*/
    }
}
