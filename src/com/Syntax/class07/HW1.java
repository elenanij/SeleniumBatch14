package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/*1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your user name in form*/

public class HW1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        WebElement helpBtn = driver.findElement(By.xpath("//a[text() = 'Help']"));

        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text() = 'Privacy']"));

        privacyBtn.click();

        Set<String> allHandles = driver.getWindowHandles();

//click on Community button

        String desiredTitle = "Google Account Help";

for(String handle:allHandles) {

    driver.switchTo().window(handle);

    String title = driver.getTitle();

    if (title.equalsIgnoreCase(desiredTitle)) {

        break;
    }
}

WebElement communityBtn = driver.findElement(By.linkText("Community"));

communityBtn.click();

//goto gmail.com page and enter your user name in form

        String desiredTitle2 = "Create your Google Account";

        for(String handle:allHandles) {

            driver.switchTo().window(handle);

            String title = driver.getTitle();

            if (title.equalsIgnoreCase(desiredTitle2)) {

                break;
            }
        }

        WebElement userNameField = driver.findElement(By.id("username"));

userNameField.sendKeys("elenanij");



    }

}
