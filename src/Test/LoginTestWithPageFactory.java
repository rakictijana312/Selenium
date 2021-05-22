package Test;

import Page.LoginPageWithPageFactory;
import TestBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory loginPageWithPageFactory = new LoginPageWithPageFactory();
        loginPageWithPageFactory.userNameTextBox.sendKeys("Admin");
        loginPageWithPageFactory.passwordTextBox.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginBtn.click();

        TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();

        }




    }

}
