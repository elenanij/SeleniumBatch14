package com.Syntax.class09;

/*got to the url http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
click on PIM
click on Employee List
from the table choose one id (it must be from the first page)
and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)

the user name is
admin
the password is
Hum@nhrm123*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement submitBtn = driver.findElement(By.name("Submit"));
        submitBtn.click();

        WebElement pimBtn = driver.findElement(By.xpath("//b[text() = 'PIM']"));
        pimBtn.click();

//check the checkBox for that id

        String target = "42654A";

        List<WebElement> allIds = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < allIds.size(); i++) {

            if (allIds.get(i).getText().equals(target)) {

                WebElement checkBox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();


            }
        }
    }
}
