package SeleniumClass6;
//Task
//Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
//verify the header text AUTOMATION TESTING PLATFORM
//BY SYNTAX is displayed
//verify enroll today button is enabled


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
        driver.get(url);
        driver.manage().window().maximize();

        //verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
        WebElement header= driver.findElement(By.xpath("//a[@href='index.php']"));
        boolean isHeader= header.isDisplayed();
        System.out.println("Automation testing platform syntax os displayed: "+isHeader);
        Thread.sleep(2000);


        System.out.println("----------------------------------------------");
        //verify enroll today button is enabled
        WebElement frame2=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
        driver.switchTo().frame("FrameTwo");

        WebElement frameErollToday=driver.findElement(By.xpath("//a[@class='enroll-btn']"));
        boolean isframeEnrollToday= frameErollToday.isEnabled();
        if(isframeEnrollToday) {
            System.out.println("*** ENABLED ***");
        }else {
            System.out.println("unableee");


        }



    }

}
