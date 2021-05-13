package reviewSelenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://swagger.io/tools/swaggerhub/";
        driver.get(url);
        driver.manage().window().maximize();

        String homepageHandle = driver.getWindowHandle();
        System.out.println("The handle for home: " + homepageHandle);
        WebElement Link1 = driver.findElement(By.xpath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']"));
        Link1.click();//click on beatbar

        Thread.sleep(2000);
        //click on some icon on the new tab
        Set<String> allhandles = driver.getWindowHandles();
        Iterator<String> it = allhandles.iterator();
        homepageHandle = it.next();
        String link1handle = it.next();
        System.out.println("the handle for childHandle: " + link1handle);
        driver.switchTo().window(link1handle);
        WebElement link2 = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/BitbarChannel/']"));
        link2.click();
        allhandles = driver.getWindowHandles();

        //OVAJ CODE MOZE DA SE SACUVA ZA KASNIJE KORISCENJE
        int handle_no=2;
        String value=null;

        for(int i=0; it.hasNext(); i++){
            value=it.next();
            if(i==handle_no){
                String link2handle = value;
                System.out.println("This is a link 2 handle"+link2handle);
                break;
            }
        }

    }
}
