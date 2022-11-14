package com.Syntax.class04;

//HRMS Application Negative Login:
//Open chrome browser
//Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text “Password cannot be empty” is displayed.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("btnLogin")).click();




    }
}
