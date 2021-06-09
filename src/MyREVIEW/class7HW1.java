package MyREVIEW;

//Go to https://demoqa.com/browser-windows
//1.ja sam dodala get main window handle and print
//2. click on New Tab and print the text from new tab in the console
//3.click on New Window and print the text from new window in the console
//4. click on New Window Message and print the text from new window in the console
//5. Verify the title is displayed
//Print out the title of the all pages//
//ja sam dodala print the title
//izadnje ce biti using iterator print all handles


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class class7HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        //1.
        String mainPageWindow= driver.getWindowHandle();
        System.out.println(mainPageWindow);
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //2.

       WebElement newTab= driver.findElement(By.id("windowButton"));
       newTab.click();
       String newTabText= newTab.getText();
       System.out.println(newTabText);

       //3.
        WebElement newWindow= driver.findElement(By.id("windowButton"));
        newTab.click();
        String newWindowText=newWindow.getText();
        System.out.println(newTabText);

        //4.
        WebElement newWindowMessage= driver.findElement(By.id("messageWindowButton"));
        newWindowMessage.click();
        String newWindowMessageText= newWindowMessage.getText();

        //5.

        WebElement header=driver.findElement(By.xpath("//div[@class='main-header']"));
        boolean isHeader= header.isDisplayed();
        System.out.println("Header is:" +isHeader);

        //6.
        Set<String> allWindowsHandles=driver.getWindowHandles();
        Iterator<String> iterator=allWindowsHandles.iterator();

        while(iterator.hasNext()){
            String handle= iterator.next();
            String title=driver.getTitle();
            System.out.println(title);
        }






    }
}