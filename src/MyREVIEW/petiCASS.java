package MyREVIEW;
//Go to ebay.com
//get all the categories and print them in the console
//select Computers/Tables & Networking
//click on search
//verify the header

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class petiCASS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
//univerzalno za sve
//        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//        System.out.println("Number of Links " + allLinks.size());
//        for (WebElement links : allLinks) {
//            String fullLink = links.getAttribute("href");
//            String linkText = links.getText();
//            if (!linkText.isEmpty()) {
//                System.out.print(linkText + "    " + fullLink);
//    }
//}

        WebElement logo=driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[1]/h1/a"));
        boolean isLogo=logo.isDisplayed();
        System.out.println("Logo is displayed: " +isLogo);



    }



}