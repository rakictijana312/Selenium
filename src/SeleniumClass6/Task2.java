package SeleniumClass6;
//HW
//Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
//click on each button and handle the alert accordingly

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";
        driver.get(url);


//        WebElement click1=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
//        click1.click();
//        Alert simpleAlert=driver.switchTo().alert();
//        Thread.sleep(5000);
//        simpleAlert.accept();

//        WebElement click2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
//        click2.click();
//        Alert alert2=driver.switchTo().alert();
//        Thread.sleep(5000);
//        alert2.dismiss();

        WebElement click3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        click3.click();
        Alert alert3=driver.switchTo().alert();
        Thread.sleep(5000);
        alert3.sendKeys("Tijana");
        Thread.sleep(5000);
        alert3.accept();
    }
}
