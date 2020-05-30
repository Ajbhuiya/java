package keypress;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActions {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");
        //using actions class to hit class
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    }
}