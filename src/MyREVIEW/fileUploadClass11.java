package MyREVIEW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadClass11 {

    public  static void main(String[] args) {

        String url = ("https://the-internet.herokuapp.com/");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement fileUploadLink=driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        //lociramo webelement gde treba da uplloudujemo fajl i posaljemo send click
        //sa path:right click na document, moze biti bilo koji

        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\tijan\\Desktop\\Maven first xml.txt");

        WebElement uploadBAutton=driver.findElement(By.id("file-submit"));
        uploadBAutton.click();



    }




}
