package keypress;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");
        //single keys
        /*driver.findElement(By.id("user_email")).sendKeys("abc@abc.com");
        driver.findElement(By.id("user_password")).sendKeys("com");
        driver.findElement(By.xpath("//input[@name='commit']")).sendKeys(Keys.ENTER);
*/

        /////////combination of keys
        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(5000);





    }
}
