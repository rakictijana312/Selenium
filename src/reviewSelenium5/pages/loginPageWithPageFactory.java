package reviewSelenium5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userName;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginBtn;


    public loginPageWithPageFactory(){


        PageFactory.initElements(driver,this);

    }



}


