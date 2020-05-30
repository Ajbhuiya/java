package calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalDropDown {

    //autocomplete or dropdown
        //inspect
        private WebDriver driver;
        private String baseUrl;

        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\firoz_000\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            driver = new ChromeDriver();
            baseUrl = "http://www.goibibo.com/";
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseUrl);
        }

        @Test
        public void testAutocomplete() throws Exception {
            String partialText = "Del";
            String textToSelect = "Delhi, India(DEL)";

            WebElement textField = driver.findElement(By.id("gosuggest_inputSrc"));
            textField.sendKeys(partialText);
            //because it disapperas when we try to inspect it, so we gotta print the elements

            WebElement ulElement = driver.findElement(By.id("react-autosuggest-1"));

            String innerHTML = ulElement.getAttribute("innerHTML");//innerhtml gets complete html inside th element
            System.out.println(innerHTML);
            //once we get it we can copy and paste to notepad and search there

            List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
            Thread.sleep(3000);

            for (WebElement element : liElements) {
                //System.out.println(element.getText());
                if (element.getText().contains(textToSelect)) {
                    System.out.println("Selected: " + element.getText());
                    element.click();
                    break;
                }
            }
        }

        @After
        public void tearDown() throws Exception {
            // driver.quit();
        }
    }

