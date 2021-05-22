package reviewSelenium5.test;

import reviewSelenium5.BaseClass;
import reviewSelenium5.pages.loginPageWithPageFactory;

public class logInWithPageFactory {
    public static void main(String[] args) {

        BaseClass.setupWithSpecificUrl("https://www.saucedemo.com/");
        loginPageWithPageFactory login= new loginPageWithPageFactory();
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginBtn.click();






}

}
