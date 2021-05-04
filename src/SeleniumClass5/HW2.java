package SeleniumClass5;

//        Go to facebook sign up page
//        Fill out the whole form
//        Click signup

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text() ='Create New Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tijana");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rakic");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("tijana_bku@gmai.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12255");
        Thread.sleep(1000);
        WebElement month = driver.findElement(By.id("month"));
        Select select = new Select(month);
        select.selectByIndex(6);
        Thread.sleep(1000);

        Select day = new Select( driver.findElement(By.id("day")));
        day.selectByVisibleText("13");
        Thread.sleep(1000);

        Select year = new Select( driver.findElement(By.id("year")));
        year.selectByVisibleText("1986");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[name='websubmit']")).click();
        Thread.sleep(1000);







    }
}