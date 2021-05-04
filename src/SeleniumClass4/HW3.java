package SeleniumClass4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Open chrome browser
//Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
//http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
//Enter valid username
//Leave password field empty
//Verify error message with text "Password cannot be empty" is displayed.
public class HW3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();

        //PASSWORD CAN'T BE EMPTY
        WebElement verifyError = driver.findElement(By.xpath("//span[text() = 'Password cannot be empty']"));
        verifyError.isDisplayed();
        Boolean error = verifyError.isDisplayed();
        System.out.println(error);
    }

}
