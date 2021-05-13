package SeleniumClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

    public static String url ="https://www.amazon.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //move to element
        WebElement accountAndList= driver.findElement(By.id("nav-link-accountList"));
        Actions action=new Actions(driver);
        action.moveToElement(accountAndList).perform();



    }
}