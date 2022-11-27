package com.Syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class screenShot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("tester");

        driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("test");

        driver.findElement(By.xpath("//input[@class = 'button']")).click();


        TakesScreenshot ss= (TakesScreenshot)driver;
//        screenshot is taken at this point
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
//        save the file from your variable into the location into your computer

        FileUtils.copyFile(sourceFile,new File("screenshots/SmartBear/adminLogin.png"));


        sourceFile = ss.getScreenshotAs(OutputType.FILE);
//        save the file from your variable into the location into your computer

        FileUtils.copyFile(sourceFile,new File("screenshots/SmartBear/adminLogin.jpeg"));

        }
    }
