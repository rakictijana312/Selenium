package reviewSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://material-ui.com/components/radio-buttons/";
        driver.get(url);


        //SELECT male and female
        List<WebElement> radiobtns = driver.findElements(By.xpath("//input[@type='radio'][@name='gender1']"));
        System.out.print(radiobtns.size());
        for (WebElement radiobtn : radiobtns) {
            String radiobtnval = radiobtn.getAttribute("value");
            if (radiobtnval.equalsIgnoreCase("male")) {
                radiobtn.click();
                break;
            }


        }
    }
}