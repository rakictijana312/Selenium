package SeleniumClass7;

//Go to https://demoqa.com/browser-windows
//click on New Tab and print the text from new tab in the console
//click on New Window and print the text from new window in the console
//click on New Window Message and print the text from new window in the console
//Verify the title is displayed
//Print out the title of the all pages


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 { //JULIA
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        String mainPageWindow= driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        WebElement newTab= driver.findElement(By.id("tabButton"));
        WebElement newWindow= driver.findElement(By.id("windowButton"));
        WebElement newWindowMessage= driver.findElement(By.id("messageWindowButton"));

        newTab.click();
        newWindow.click();
        newWindowMessage.click();

        Set<String> allWindowsHandles=driver.getWindowHandles();
        Iterator<String> iterator=allWindowsHandles.iterator();

        while(iterator.hasNext()){
            String handle= iterator.next();
            String title=driver.getTitle();
            System.out.println(title);
        }



    }
}
