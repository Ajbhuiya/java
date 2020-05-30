package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NumOfElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\firoz_000\\Downloads\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com");
        List <WebElement> numOfLinks = driver.findElements(By.tagName("a"));

        System.out.println(numOfLinks.size());
        for(int i=0; i<numOfLinks.size();i++){
            String linkText = numOfLinks.get(i).getText();
            System.out.println(linkText);

            //System.out.println(numOfLinks.get(i).getText()); this other way to do in loop
        }
    }
}
