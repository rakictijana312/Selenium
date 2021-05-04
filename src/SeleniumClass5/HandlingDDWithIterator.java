package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;

public class HandlingDDWithIterator {

    public static String url="http://amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD= driver.findElement(By.id("searchDropdownBox"));
        Select select= new Select(categoriesDD);
        boolean isMultiple= select.isMultiple();
        if(!isMultiple){
            List<WebElement> options=select.getOptions();
            Iterator<WebElement>it=options.iterator();
            while(it.hasNext()){
                WebElement ddOptions= it.next();
                String optionText=ddOptions.getText();
                System.out.println(optionText);
            }
        }


    }
}
