package SeleniumClass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static String url="http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //handling frames by index
        driver.switchTo().frame(0);
        WebElement textBox= driver.findElement(By.id("name"));
        textBox.sendKeys("Covid sucks");

        driver.switchTo().defaultContent();
//        WebElement alertButton =driver.findElement(By.id("alert"));
//        alertButton.click();

        //by name
        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("Selenium rocks");

        driver.switchTo().defaultContent();
        //by webelement
        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Syntax");

    }
}
