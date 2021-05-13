package SeleniumClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticTable {
    public static String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //get number of rows=7
        List<WebElement> rowData= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());

        //using Iterator acces data from rows
        Iterator<WebElement> it= rowData.iterator();
        while(it.hasNext()){
            WebElement row=it.next();
            String rowText=row.getText();
            System.out.println(rowText);//it will print all row data on cosole


        }
        //acces all colum in header
        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(colsData.size());
        for(WebElement colData: colsData) {
            String colText = colData.getText();
            System.out.println(colText);

    }
}}