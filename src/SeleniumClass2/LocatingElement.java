package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("tijanicaa_nis@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("Janko2707");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElements(By.linkText("Forgot Password"));
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();






    }
}
