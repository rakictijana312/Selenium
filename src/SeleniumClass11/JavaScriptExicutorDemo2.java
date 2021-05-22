package SeleniumClass11;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExicutorDemo2 {
    public static void main(String[] args) throws InterruptedException {
        String url = ("http://amazon.com");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Scrool down
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        //scroll up
        js.executeScript("window.scrollBy(0,-500)");

        //Scroll back to top

                ;
        }
    }