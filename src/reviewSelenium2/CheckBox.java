package reviewSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ;
        String url = "https://www.ironspider.ca/forms/checkradio.htm";

        driver.get(url);

        WebElement redCheckBox = driver.findElement(By.xpath("//input[@value='red']"));

        boolean redCheckBoxisenabledEnabled = redCheckBox.isEnabled();
        System.out.println("The check box is Enabled :" + redCheckBoxisenabledEnabled);

        boolean redCheckBoxisselected = redCheckBox.isSelected();
        System.out.println("The check box is Selected :" + redCheckBoxisselected);

        Thread.sleep(2000);
        redCheckBox.click();//enabling the check
        Thread.sleep(2000);
        redCheckBoxisselected = redCheckBox.isSelected(); //getting wether it is selected or not
        System.out.println("The check box is Selected :" + redCheckBoxisselected); //prinitng out the status

        List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));//KOristimo ALL ELEMENTS driver.findElements zato sto ih ima vise
        System.out.println("number of check boxes :" + Checkboxes.size());//6

        //select yellow , orange and purple check box
        for (WebElement checkBox : Checkboxes) {
            Thread.sleep(2000);
            String CheckboxValue = checkBox.getAttribute("value");
            System.out.println(CheckboxValue);
            if (CheckboxValue.equalsIgnoreCase("yellow")) {
                checkBox.click();
                break;

            }
        }
    }
}