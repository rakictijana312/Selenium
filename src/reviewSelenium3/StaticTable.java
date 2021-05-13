package reviewSelenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
        driver.get(url);
        driver.manage().window().maximize();


        List<WebElement> row = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(row.size());//7 ----odstampace sve redove
        for (WebElement x : row) {
            System.out.println(x.getText());
        }
      //  odstampati header
        List<WebElement> header = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        for (WebElement y : header) {
            System.out.println(y.getText());


        }
    }
}