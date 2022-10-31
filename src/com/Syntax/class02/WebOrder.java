package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //go to smartbear.com

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
         driver.manage().window().maximize();

         driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

         driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(("test"));

         driver.findElement(By.className("button")).click();

         // Make sure that the title is correct - Web Orders

       String title = driver.getTitle();

       if(title.equalsIgnoreCase("Web Orders")) {

           System.out.println("Title is correct: " +title);
       }

       else {

           System.out.println("The title is incorrect");
       }


    }
}
