package com.Syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        driver.manage().window().maximize();

        //find the checkBoxes

        List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));

// what does this list contain?
//        it contains all the 6 Webelements

        for (WebElement checkBx : checkbxes) {

            String color = checkBx.getAttribute("value");

            if (color.equalsIgnoreCase("orange")) {
                checkBx.click();
                break;


            }
        }
    }
}
