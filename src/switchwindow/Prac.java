package switchwindow;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Prac {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://letskodeit.teachable.com/pages/practice";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void test() throws InterruptedException {

        String parentHandle =driver.getWindowHandle();
        WebElement openWindow = driver.findElement(By.xpath("opentab"));
        openWindow.click();

        Set<String> handles = driver.getWindowHandles();

        for(String handle:handles){
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                driver.findElement(By.name("query")).sendKeys("abc1234567890");
                driver.close();
               driver.switchTo().window(parentHandle);
                System.out.println(driver.getCurrentUrl());
            }
        }




















        /*String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);*/

/*
        driver.findElement(By.id("openwindow")).click();

        Set<String> handles = driver.getWindowHandles();
*/

      /*  Iterator<String> itr =handles.iterator();
        String mainWindow = itr.next();
        String secWindow = itr.next();
        System.out.println(driver.getTitle());
        driver.switchTo().window(secWindow);
        driver.findElement(By.id("search-courses")).sendKeys("phython");
        driver.close();

        driver.switchTo().window(mainWindow);
        driver.findElement(By.id("name")).sendKeys("aj booya");
        System.out.println(driver.getCurrentUrl());*/

       /* for (String handle : handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchBox = driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");
                Thread.sleep(2000);
                driver.close();
                break;
            }
        }
        // Switch back to the parent window
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("name")).sendKeys("Test Successful");*/


        }
    }

