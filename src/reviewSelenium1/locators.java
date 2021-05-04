package reviewSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
        //enter userName:
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        //enter password:
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
       //logIn
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        //pick the bag
        driver.findElement(By.className("inventory_item_name")).click();
        Thread.sleep(3000);
        //add to cart
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        //go back
        driver.navigate().back();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        //click on ABOUT
        driver.findElement(By.linkText("ABOUT")).click(); //mala su slova u inspect page "about"
        Thread.sleep(5000);
        //get Title
        String tilte=driver.getTitle();
        //Test
        if(tilte.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs"))
        {
            System.out.println("you were naviagted to right page");
        }
        else
        {
            System.out.println("you were naviagted to wrong page");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);


        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("checkout")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("LOG")).click();

    }}