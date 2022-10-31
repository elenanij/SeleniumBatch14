package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //enter login

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadabra");

        //click on forgot password

        Thread.sleep(1000);

        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//a[text() = 'Forgot password?']")).click();

        //click on login - contains w/attribute

       // driver.findElement(By.xpath("//button[contains(@type, 'sub')]")).click();

        //click on forgot password - contains w/text

        //driver.findElement(By.xpath("//a[contains(text(), 'Forgot')]")).click();

        //starts-with

        //driver.findElement(By.xpath("//input[starts-with(@name, 'pa')]")).sendKeys("12345");






    }
}
