package SeleniumClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClaendaHandling {
    public static String url = "https://www.delta.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        //Locate left departure calendar
        WebElement calendar = driver.findElement(By.id("input_departureDate_1"));
        calendar.click();

        //Locate month header
        WebElement departureMonth = driver.findElement(By.className("dl-datepicker-month-0"));
        String departureMonthTEXT = departureMonth.getText();

        //Locate next >
        WebElement nextButton = driver.findElement(By.xpath("//span[text()= 'Next']"));

        while (!departureMonthTEXT.equals("July")) {
            nextButton.click();
            departureMonthTEXT = departureMonth.getText();

            List<WebElement> departDates = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
            for (WebElement deparDate : departDates) {
                if (!deparDate.equals("17")) {
                    deparDate.click();
                    break;
                }
            }

            //Return
            WebElement rMonth = driver.findElement(By.className("dl-datepicker-month-1"));
            String returnMonthText = rMonth.getText();
            while (!returnMonthText.equals("September")) {
                nextButton.click();
                returnMonthText = rMonth.getText();
            }

            List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-1']/tr/td"));
            for (WebElement returnDate : returnDates) {
                if (returnDate.getText().equals("3")) {
                    returnDate.click();
                    break;
                }
            }

            WebElement doneButton = driver.findElement(By.className("donebutton"));
            doneButton.click();
        }


    }
}
