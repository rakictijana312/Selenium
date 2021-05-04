package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
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

public class HW1 {
    public static String url="https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createAccount= driver.findElement(By.xpath("//a[text() ='Create New Account']"));
        createAccount.click();
        Thread.sleep(1000);

        //month dd has 12 month options
        WebElement monthDD=driver.findElement(By.id("month"));//locate
        Select select=new Select(monthDD);//select class
        List<WebElement> allMonths=select.getOptions();//get options
        int size=allMonths.size();//size
        System.out.println("Number of months " +size);//print

        //day dd has 31 day options
        WebElement dayDD=driver.findElement(By.id("day"));
        Select select1=new Select(dayDD);
        List<WebElement>allDays=select1.getOptions();
        int days=allDays.size();
        System.out.println("Number of days " +days);

        //year dd has 115 year options
        WebElement yearDD=driver.findElement(By.id("year"));
        Select select2= new Select(yearDD);
        List<WebElement>allYears=select2.getOptions();
        int years=allYears.size();
        System.out.println("Number of years is: "+years);










    }
}
