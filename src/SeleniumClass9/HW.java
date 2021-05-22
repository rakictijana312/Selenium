package SeleniumClass9;
//HW
//Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
//log in
//click on leave
//click on leave list
//choose from "From calendar"
//choose from "To calendar"
//click only on cancelled and rejected checkboxes
//uncheck Pending Approval
//select IT support from DD
//click search
//quit the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class HW {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        Thread.sleep(3000);
        //click on leave
        WebElement leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
        leave.click();

        //Access from
        WebElement fromCalendar= driver.findElement(By.id("calFromDate"));
        fromCalendar.click();
         //Click on month
        WebElement month=driver.findElement(By.className("ui-datepicker-month"));
       //select month
        Select monthDropButton= new Select(month);
        monthDropButton.selectByVisibleText("Jul");

        //Acces to table
        List<WebElement> fromDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(fromDates.size());
        for(WebElement fromDate:fromDates){
            if (fromDate.getText().equals("29")) {
                fromDate.click();
                break;
            }
        }
        //Access toCalendar
        WebElement toCalendar=driver.findElement(By.id("calToDate"));
        toCalendar.click();
        //Click on month
        WebElement toMonth=driver.findElement(By.className("ui-datepicker-month"));
        Select toMonthDroppButton=new Select(toMonth);
        toMonthDroppButton.selectByVisibleText("Sep");

        //Acces to toTaABLE
        List<WebElement> toDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(toDates.size());
        for(WebElement toDate:toDates){
            if (toDate.getText().equals("24")){
                toDate.click();
                break;
            }
        }

        //click only on cancelled and rejected checkboxes
       List<WebElement> checkBoxes=driver.findElements(By.xpath("//div[@id='leaveList_chkSearchFilter_checkboxgroup']/label"));
        System.out.println(checkBoxes.size());
        for(WebElement checkbox:checkBoxes) {
            if (checkbox.getText().equals("Cancelled") || checkbox.getText().equals("Rejected")) {
                checkbox.click();
            }

            //uncheck pending approval
            if (checkbox.getText().equals("Pending Approval")) {
                checkbox.click();

            }
            //select IT support from DROPDOWN
            WebElement subUnit=driver.findElement(By.id("leaveList_cmbSubunit"));
            Select subUnitDropDown= new Select(subUnit);
            subUnitDropDown.selectByVisibleText("IT Support");


            //click search
            WebElement clickSearch= driver.findElement(By.id("btnSearch"));
            clickSearch.click();
            Thread.sleep(3000);

            //quit
            driver.quit();


        }
    }}
