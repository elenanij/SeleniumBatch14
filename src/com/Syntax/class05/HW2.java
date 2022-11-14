package com.Syntax.class05;

/*
HW2
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {

    public static void main(String[] args) {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // got to facebook website
        driver.get("https://www.ebay.com/");

        //maximize
        driver.manage().window().maximize();

        List<WebElement> categories = driver.findElements(By.tagName("select"));

        for (WebElement category : categories) {

            String name = category.getText();
            System.out.println(name);
        }

        System.out.println("--------------------");

        WebElement DD = driver.findElement(By.tagName("select"));

        Select select = new Select(DD);

        select.selectByValue("58058");

        WebElement searchButton = driver.findElement(By.xpath("//input[@value = 'Search']"));

        searchButton.click();

        String title = driver.getTitle();

        if (title.equals("Computers, Tablets & Network Hardware")) {

            System.out.println("Title verified");
        } else {

            System.out.println("Title does not match");
            System.out.println("Current title: " + title);
        }

    }
}


