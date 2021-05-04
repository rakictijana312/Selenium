package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
    //    driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        String title= driver.getTitle();
        if(title.equalsIgnoreCase("web orders")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is wrong");
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();


    }
}
