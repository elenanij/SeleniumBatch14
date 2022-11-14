package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {

    public static void main(String[] args) {

        /*1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php

2. click on get New User
3. get the firstname  of user and print it on console */


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //click on get New User

        WebElement newUserBtn = driver.findElement(By.xpath("//button[@id = 'save']"));

        newUserBtn.click();

        //get the firstname  of user and print it on console

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));

        String firstNameText = firstName.getText();

        String[] nameArr = firstNameText.split(" ");

        String firstNameOnly = nameArr[3];

        System.out.println(firstNameOnly);


    }
}
