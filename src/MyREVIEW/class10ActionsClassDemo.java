package MyREVIEW;

////////TO PREFORM ACTIONS ON WEBPAGE WE CAN USE ACTION CLASS OR JAVASCRIPT EXICUTOR, DEPENDS ON ACTIONS//////


//go to amazon
//double click on prime
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class10ActionsClassDemo {
    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement tex=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        tex.sendKeys("Tijana");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='red'", tex);

//
//        //double click
//        WebElement prime= driver.findElement(By.xpath("//span[text()='Prime']"));
//        Actions action=new Actions(driver);
//        action.doubleClick(prime).perform();


//        //Scrool down
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//        Thread.sleep(3000);

//      //  scroll up
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-500)");
//


//        //open new tab
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.open();");

    }
}