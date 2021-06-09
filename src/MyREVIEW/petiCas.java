package MyREVIEW;
// 1: Facebook dropdown verification
//Open chrome browser
//Go to "https://www.facebook.com"
//click on create new account
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth
//Quit browser

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;

public class petiCas {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        //month dd has 12 month options
        WebElement month=driver.findElement(By.id("month"));
        Select select=new Select(month);
        List<WebElement> allMonths=select.getOptions();
        int size=allMonths.size();
        System.out.println("Number of months is : " + size);


        TakesScreenshot ts=(TakesScreenshot)driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/mojiScreenShots/prvi.png") );
        } catch (IOException e) {
            e.printStackTrace();
        }






    }}
