package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) {
        //go to FB.com
        //Enter Username
        //ENter password
        //click login

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //go to facebook.com
        driver.navigate().to("https://www.facebook.com/");

        //maximize

        driver.manage().window().maximize();

        //enter the Username in the textbox

        // 1. locate the element and send the keys

        driver.findElement(By.id("email")).sendKeys("abracadabra");

        driver.findElement(By.name("pass")).sendKeys("waow12345678");

        //driver.findElement(By.name("login")).click();

        //task2
        //click on forgot password

        //driver.manage().window().maximize();

        //driver.findElement(By.linkText("Forgot password?")).click();


        // task3

        driver.findElement(By.partialLinkText("Forgot")).click();





    }
}
