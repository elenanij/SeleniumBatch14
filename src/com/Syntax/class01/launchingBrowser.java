package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a webdriver instance

        WebDriver driver = new ChromeDriver();

        // use the get() function to open the required websute
        driver.get("https://www.google.com/");

        String url = driver.getCurrentUrl();
        //print the url

        System.out.println(url);

        //print the title

        String title = driver.getTitle();

        System.out.println(title);

        //close chrome

        driver.quit();
        driver.close();

    }
}
