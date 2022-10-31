package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text() = ' Start Practising ']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[2]")).click();

        driver.findElement(By.xpath(" //input[contains(@placeholder, 'Please enter')]")).sendKeys("Selenium is fun");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(), 'Show')]\n")).click();
        Thread.sleep(2000);

        driver.close();





    }
}
