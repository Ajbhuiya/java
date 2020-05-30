package screenshot;


import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Screenshot {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.facebook.com/";
        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testScreenshots() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
    }

    @After
    public void tearDown() throws Exception {
        String filename = getRandomString(10) + ".png";//10 is length of filename
        String directory = System.getProperty("user.dir") + "//screenshots//";//gets project directory and creates screenshot direc
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//this file takes screenshot
        FileUtils.copyFile(sourceFile, new File(directory + filename));//this copies to file
        driver.quit();
    }

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";//reandom letters to create file name
        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

}
