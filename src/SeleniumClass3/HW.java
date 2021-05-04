package SeleniumClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HW
//Navigate to http://syntaxtechs.com/selenium-practice/index.php
//Click on start practicing
//click on simple form demo
//enter any text on first text box
//click on show message
//quit the browser
public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.manage().window().maximize();
        WebElement startPractice = driver.findElement(By.xpath("//a[text() = ' Start Practising ']"));
        startPractice.click();
        Thread.sleep(2000);
        WebElement simpleForm = driver.findElement(By.xpath("//a[text()='Simple Form Demo']/parent::div"));
        simpleForm.click();
        Thread.sleep(2000);
        WebElement enterMessage= driver.findElement(By.xpath("//input[starts-with(@id, 'user')]"));
        enterMessage.sendKeys("Tijana");
        Thread.sleep(2000);
        WebElement showMessage= driver.findElement(By.xpath(" //button[text()= 'Show Message']"));
        showMessage.click();
        Thread.sleep(2000);
        driver.quit();



    }
}

