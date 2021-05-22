package SeleniumClass11;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightandDoubleClicActions {
    public static void main(String[] args) {

        String url = ("http://demo.guru99.com/test/simple_context_menu.html");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).perform();
        action.contextClick(rightClickButton).perform();
        WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit'] "));
        //editOption.click();
        action.click(editOption).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
        action.doubleClick(doubleClickButton).perform();
        System.out.println(alert.getText());
        alert.accept();
    }

}



