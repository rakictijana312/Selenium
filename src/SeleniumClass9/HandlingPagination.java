package SeleniumClass9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingPagination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement logIn =driver.findElement(By.id("btnLogin"));
        logIn.click();



        WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
        pim.click();
        WebElement addemployee=driver.findElement(By.id("menu_pim_addEmployee"));
        addemployee.click();

        WebElement firstname=driver.findElement(By.id("firstName"));
        firstname.sendKeys("Tijana");

        WebElement lastname=driver.findElement(By.id("lastName"));
        lastname.sendKeys("Rakic");

        WebElement id=driver.findElement(By.id("employeeId"));
        String empID=id.getAttribute("value");

        WebElement savebutton=driver.findElement(By.id("btnSave"));
        savebutton.click();

        WebElement employeeList=driver.findElement(By.linkText("Employee List"));
        employeeList.click();

        List<WebElement> tablerows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        boolean flag=true;
        while(flag){
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
            for(int i = 0; i < tableRows.size(); i++) {
                String rowText = tableRows.get(i).getText();
                if(rowText.contains(empID)) {
                    flag = false;
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + i + "]/td[1]"));
                    checkbox.click();
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;
                }
            }
            WebElement next = driver.findElement(By.linkText("Next"));
            next.click();


            }
        }
    }





