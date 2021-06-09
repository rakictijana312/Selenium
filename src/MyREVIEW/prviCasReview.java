package MyREVIEW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//goto bbc.com
// click on signin
//click on register now
// click on age greater then 16
// enter day month and year and press continue*/

public class prviCasReview {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[@id='idcta-username']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Register now']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='16 or over']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='day-input']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@id='month-input']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='year-input']")).sendKeys("1986");
        driver.findElement(By.xpath("//button[@id='submit-button']")).click();




    }

}
