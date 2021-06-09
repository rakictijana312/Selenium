package SeleniumClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExicutorDemo3 {
    public static void main(String[] args) throws InterruptedException {
        String url = ("http://google.com");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //open new tab
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");
//        WebElement search = driver.findElement(By.name("q"));
//        search.sendKeys("dfsfsf");


    }
}