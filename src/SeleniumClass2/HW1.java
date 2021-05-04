package SeleniumClass2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
      // String title = driver.getTitle();
        WebElement firstName= driver.findElement(By.name("customer.firstName"));
        firstName.sendKeys("Tijana");
        WebElement lastName= driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Rakic");
        WebElement address=driver.findElement(By.name("customer.address.street"));
        address.sendKeys("6104 Glen Dr");
        WebElement city=driver.findElement(By.id("customer.address.city"));
        city.sendKeys("WPB");
        WebElement state=driver.findElement(By.name("customer.address.state"));
        state.sendKeys("Florida");
        WebElement zipCode=driver.findElement(By.name("customer.address.zipCode"));
        zipCode.sendKeys("33409");
        WebElement phone= driver.findElement(By.name("customer.phoneNumber"));
        phone.sendKeys("56125895");;
        WebElement ssn= driver.findElement(By.name("customer.ssn"));
        ssn.sendKeys("1266666");
        WebElement userName= driver.findElement(By.id("customer.username"));
        userName.sendKeys("tijana_bku");
        WebElement createPass= driver.findElement(By.id("customer.password"));
        createPass.sendKeys("12345");
        WebElement repitPass=driver.findElement(By.name("repeatedPassword"));
        repitPass.sendKeys("12345");
        WebElement register=driver.findElement(By.partialLinkText("Register"));
        register.click();
        driver.quit();
    }
}
