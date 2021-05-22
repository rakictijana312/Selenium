package reviewSelenium5.test;

import reviewSelenium5.BaseClass;
import reviewSelenium5.pages.LoginPage;

public class LoginTest extends BaseClass {
    
    public static void main(String[] args) {
        BaseClass.setupWithSpecificUrl("https://www.saucedemo.com/");
        LoginPage login=new LoginPage();
        login.userName.sendKeys("standard_user");
        login.Password.sendKeys("secret_sauce");
        login.loginBtn.click();


    }
}