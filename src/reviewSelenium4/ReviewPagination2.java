package reviewSelenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewPagination2 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement logIn = driver.findElement(By.id("btnLogin"));
        logIn.click();

        WebElement pim= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();







    }
    }
