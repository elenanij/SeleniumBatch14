package com.Syntax.class05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {

    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // got to facebook website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //maximize
        driver.manage().window().maximize();
    }
}
