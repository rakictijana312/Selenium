package SeleniumClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

//HW
//        go to https://the-internet.herokuapp.com/dynamic_controls
//        click on checkbox and click on remove
//        verify the text

//        click on enable verify the textbox is enabled
//        enter text and click disable
//        verify the textbox is disabled
public class HW {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.xpath("//div[@id='checkbox']"));
        checkBox.click();

        WebElement removeButton = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeButton.click();

        //verify da li je text display:yes or no?
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement text = driver.findElement(By.cssSelector("p[id='message']"));
        boolean isText = text.isDisplayed();
        System.out.println("Da li se test odstampao : " + isText);//true


        System.out.println(text.isDisplayed());
        //odstampaj text
        System.out.println(text.getText());//It's gone!

        // click on enable verify the textbox is enabled
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement enableButton = driver.findElement(By.xpath("//*[@id='input-example']/button"));
        enableButton.click();
        boolean isenableButton= enableButton.isEnabled();
        System.out.println(isenableButton);

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        WebElement enterText = driver.findElement(By.xpath("//input[@type='text']"));
//        enterText.sendKeys("HomeWork"); //ne radiiiiii

        WebElement disableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableButton.click();
        boolean isdisableButton=disableButton.isEnabled();
        System.out.println(isenableButton);




    }
}