package switchwindow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindowDemo {

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

//
//		WebElement searchBox = driver.findElement(By.id("search-courses"));
//		searchBox.sendKeys("python");
        // Get the handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: " + parentHandle);

        // Find Open Window button
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

        // Get all handles
        Set<String> handles = driver.getWindowHandles();

        // Switching between handles
        for (String handle : handles) {
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
        driver.findElement(By.id("name")).sendKeys("Test Successful");
        }

        @After
        public void tearDown () throws Exception {
        }
    }
