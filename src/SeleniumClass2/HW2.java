package SeleniumClass2;

//navigate to fb.com
//click on create new account
//fill up all the textboxes
//click on sign up button
//close the pop up
//close the browser


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createAccunt=driver.findElement(By.partialLinkText("Create New Account"));
        createAccunt.click();
        Thread.sleep(5000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Tijana");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Rakic");
        WebElement mobile=driver.findElement(By.name("reg_email__"));
        mobile.sendKeys("66666");
        WebElement newPassword= driver.findElement(By.name("reg_passwd__"));
        newPassword.sendKeys("6666");
        WebElement signIn=driver.findElement(By.name("websubmit"));
        signIn.click();
        driver.quit();
    }
}
