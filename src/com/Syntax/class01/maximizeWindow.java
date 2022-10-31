package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {

    public static void main(String[] args) throws InterruptedException {

        // go to google.com and maximize your window

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a webdriver instance

        WebDriver driver = new ChromeDriver();

        // use the get() function to open the required websute
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.manage().window().fullscreen(); // no url visible

        driver.quit();
    }
}
