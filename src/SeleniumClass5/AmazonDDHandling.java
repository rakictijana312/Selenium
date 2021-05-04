//package SeleniumClass5;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.List;
//
//public class AmazonDDHandling {
//    public static String url="http://amazon.com";
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get(url);
//        WebElement categoriesDD= driver.findElement(By.id("searchDropdownBox"));
//        Select select= new Select(categoriesDD);
//
//        //select by  value
////        List<WebElement> options=select.getOptions();
////        for(WebElement option:options){
////            String optiontext= option.getText();
////            System.out.println(optiontext);
//
//     //   }
//        //select by invisible text
//        //select.selectByValue("search-alias=alexa-skills");
//
//
//
//
//
////    }
////}
