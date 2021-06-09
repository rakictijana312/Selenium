package MyREVIEW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class6HandlingFrames {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromeiver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //handling frames by index
        driver.switchTo().frame(0);
        WebElement textBox= driver.findElement(By.id("name"));
        textBox.sendKeys("Covid sucks");
        driver.switchTo().defaultContent();
        WebElement alertButton =driver.findElement(By.id("alert"));
        alertButton.click();

    }
}