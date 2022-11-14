package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.manage().window().maximize();

        //check the checkBox

        driver.switchTo().frame("frame1");

        driver.switchTo().frame("frame3");

        WebElement checkBox = driver.findElement(By.xpath("//input"));

        checkBox.click();

        //Select BabyCat from drop down

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        WebElement dropDown = driver.findElement(By.id("animals"));

        Select select = new Select(dropDown);

        select.selectByValue("babycat");

        //Send text in text box "DONE"

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        WebElement textBox = driver.findElement(By.xpath("//input"));

        textBox.sendKeys("Done");


    }
}
