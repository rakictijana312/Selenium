package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.quit();//will quit whole browser
        driver.close();//will close current tab



    }

    }

