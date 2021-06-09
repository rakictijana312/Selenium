package SeleniumClass12.TestBase.pages;

import SeleniumClass12.TestBase.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}
