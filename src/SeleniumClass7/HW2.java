package SeleniumClass7;

//navigate to http://www.uitestpractice.com/Students/Contact
//click on the link
//get text
//print out in the console

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement link1 =driver.findElement(By.linkText("This is a Ajax link"));
        link1.click();

        WebElement text = driver.findElement(By.xpath("//div[@class='ContactUs']"));
        String textBlock=text.getText();
        System.out.println(textBlock);

    }
}
