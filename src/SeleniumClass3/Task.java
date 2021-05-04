package SeleniumClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        // driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.xpath("//input[contains(@id, 'username')]"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        WebElement logIn= driver.findElement(By.xpath(""));


    }}