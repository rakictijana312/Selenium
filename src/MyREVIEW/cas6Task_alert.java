package MyREVIEW;
//Task
//Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
//verify the header text AUTOMATION TESTING PLATFORM/BY SYNTAX is displayed
//verify enroll today button is enabled//ja sam dodala get Text from reg Now


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cas6Task_alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
        driver.get(url);
        driver.manage().window().maximize();

        //verify the header text AUTOMATION TESTING PLATFORM
        WebElement header=driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]/img"));
        boolean isHeader= header.isDisplayed();
        System.out.println("Test is displayed:" +isHeader);

//        WebElement register=driver.findElement(By.xpath("//button[@id='makaha-FieldsElementButton--MwIMvgrERPigW6L899QY']"));
//        boolean isregiste= register.isEnabled();
//        if(isregiste){
//            System.out.println("enabled");
//        }else{
//            System.out.println("disable");
//        }


        WebElement register1=driver.findElement(By.xpath("//a[text()='Courses']"));
        String m=register1.getText();
        System.out.println(m);




    }
}
