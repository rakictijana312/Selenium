package MyREVIEW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//pokazuje da ne radi chrome tako da nisam mogla da provezbam


public class cas6HandlingAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

//      //handling sample alerts//accept or ok
//        WebElement simpleAlert= driver.findElement(By.xpath("//button[@id='alert']"));
//        simpleAlert.click();
//        Thread.sleep(5000);
//        Alert simleAlert=driver.switchTo().alert();
//        simleAlert.accept();


        //handling prompt  getText/sendKeys/accept

//        WebElement promt=driver.findElement(By.id("prompt"));
//        promt.click();
//        Thread.sleep(2000);
//        Alert promtAlert=driver.switchTo().alert();
//        promtAlert.sendKeys("tijana");
//        promtAlert.accept();

        //handling confirmation alerts/get text/dismiss
        WebElement confirmation= driver.findElement(By.id("confirm"));
        confirmation.click();
        Thread.sleep(2000);
        Alert confirmAlert=driver.switchTo().alert();
        String alertAText= confirmAlert.getText();
        System.out.println(alertAText);
        confirmAlert.dismiss();






    }
}