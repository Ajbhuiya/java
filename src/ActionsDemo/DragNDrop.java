package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
    public static void main(String[] args) throws InterruptedException {

        //before methods
        System.setProperty("webdriver.gecko.driver","C:\\Users\\firoz_000\\Downloads\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.jqueryui.com/droppable/");
        //this is an example with frame with drap and drop inside it

        //drag and drop actions
        driver.switchTo().frame(0);//switch to frame

        WebElement sourceEle = driver.findElement(By.id("draggable"));
        WebElement targetEle = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);

        act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
        Thread.sleep(7000);
        driver.quit();





    }
}
