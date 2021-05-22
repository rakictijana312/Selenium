package Test;

import Page.LoginPage;
import TestBase.BaseClass;

public class LoginTest {
    public static void main(String[] args) {
        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();
    }
}
