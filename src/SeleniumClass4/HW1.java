package SeleniumClass4;
//Task
//Open chrome browser
//Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard
//Enter valid username and password (username - Admin, password - Hum@nhrm123)
//Click on login button
//Then verify Syntax Logo is displayed.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys(" Admin");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Hum@nhrm123");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.button")).click();

        //Logo is displayed
        WebElement syntaxLogo= driver.findElement(By.cssSelector("img[src$='syntax.png']"));
        syntaxLogo.isDisplayed();
        Boolean logoDisplayed = syntaxLogo.isDisplayed();
        System.out.println(logoDisplayed);


    }
}
