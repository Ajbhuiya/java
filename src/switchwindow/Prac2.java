package switchwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Prac2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");

       // String parent = driver.getWindowHandle();
        Thread.sleep(3000);
        driver.findElement(By.id("openwindow")).click();

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> handle= handles.iterator();
        String parentHandle =handle.next();
        String childHandle =handle.next();
       // System.out.print(parentHandle + " " + childHandle);
        driver.switchTo().window(childHandle);
        driver.findElement(By.id("search-courses")).sendKeys("selenium");
        driver.close();
        driver.switchTo().window(parentHandle);
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.quit();




            }
        }





















/*String parentHandle = driver.getWindowHandle();

        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();
        System.out.println(driver.getWindowHandle());

        Set<String> handles = driver.getWindowHandles();
        for(String handle :handles){
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchBox = driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");*/







//another way
        /*Set<String> handles= driver.getWindowHandles();
        Iterator<String>itr = handles.iterator();
        String parentHandle = itr.next();
        String childHandle = itr.next();
        driver.switchTo().window(childHandle);
        driver.findElement(By.id("search-courses")).sendKeys("java");
        driver.findElement(By.id("search-course-button")).click();
        driver.close();
        driver.switchTo().window(parentHandle);*/





        // Maximize the browser's window

