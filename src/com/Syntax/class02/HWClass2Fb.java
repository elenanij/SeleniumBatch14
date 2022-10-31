package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass2Fb {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.name("firstname")).sendKeys("Alison");
        driver.findElement(By.name("lastname")).sendKeys("Dawson");
        driver.findElement(By.name("reg_email__")).sendKeys("elenanij@gmail.com");

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("elenanij@gmail.com");

        driver.findElement(By.id("password_step_input")).sendKeys("Ghfyn675Kl");

        driver.findElement(By.name("birthday_month")).sendKeys("Dec");
        driver.findElement(By.name("birthday_day")).sendKeys("4");

        driver.findElement(By.name("birthday_year")).sendKeys("1999");

        Thread.sleep(1000);

    driver.findElement(By.className("_8esa")).click();

    driver.findElement(By.name("websubmit")).click();

        Thread.sleep(5000);

        driver.findElement(By.linkText("Close")).click();

        driver.close();

    }
}
