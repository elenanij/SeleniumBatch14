package com.Syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));

        createAccountButton.click();


//print all the available months in the console

        Thread.sleep(3000);

        WebElement monthDD = driver.findElement(By.cssSelector("select[title = 'Month']"));

        Select selectM = new Select(monthDD);

        List<WebElement> months = selectM.getOptions();

        for(WebElement month:months) {

            String monthName = month.getText();

            System.out.println(monthName);
        }

        //OR


        for(int i = 0; i<months.size(); i++) {

            String month = months.get(i).getText();

            System.out.println(month);
        }

    }
}
