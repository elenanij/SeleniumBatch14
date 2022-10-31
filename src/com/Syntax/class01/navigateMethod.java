package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

    public static void main(String[] args) throws InterruptedException {

        //go to google.com
        //go to facebook.com
        //go back to google.com

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //go to google.com

        driver.get("https://www.google.com/");
        //go to facebook.com
        driver.navigate().to("https://www.facebook.com/");

        //introduce sleep which is wait or pause

        Thread.sleep(2000);
        // go back to google
        driver.navigate().back();

        //go back to fb

        driver.navigate().forward();

        Thread.sleep(1000);

        //refresh

        driver.navigate().refresh();





    }
}
