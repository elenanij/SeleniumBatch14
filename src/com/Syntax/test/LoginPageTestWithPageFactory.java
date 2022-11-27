package com.Syntax.test;

import com.Syntax.pages.LoginPageWithPageFactory;
import com.Syntax.utils.CommonMethods;

public class LoginPageTestWithPageFactory {

    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22)");
        LoginPageWithPageFactory login =new LoginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();

    }
}
