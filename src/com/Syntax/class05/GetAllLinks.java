package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
        System.out.println("The size of the list is: "+ ebayLinks.size());

        //implementing a for loop to traverse through the list of the WebElements

        for(WebElement ebayLink: ebayLinks){
            //extracting the value of attribute href because it contains the link embedded in webElement
            String link = ebayLink.getAttribute("href");
            //print the link

            System.out.println(link);
        }


    }
}
