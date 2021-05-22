package reviewSelenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReviewPagination {
    public static String url = "http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> tablerows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        int size = tablerows.size();
        System.out.println(size);
        WebElement nxtbtn = driver.findElement(By.xpath("//a[@class='next_link']"));
        boolean flag= true;
        while(flag){
            for(WebElement tablerow:tablerows){
                String rowtext = tablerow.getText();
                if(rowtext.contains("Juan valdez"))
                {    flag=false;
                    System.out.println(rowtext);
                    break;
                }
            }
            if(flag) {
                nxtbtn.click();
            }
        }
    }}

