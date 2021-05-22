package SeleniumClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExicutorDemo {
    public  static void main(String[] args) throws InterruptedException {

        String url = ("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement logIn =driver.findElement(By.id("btnLogin"));
       // logIn.click();


        //highlight password element
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='red'", pass);

        Thread.sleep(2000);
        //to click on webelement -login
        js.executeScript("arguments[0].click()", logIn);






    }}
