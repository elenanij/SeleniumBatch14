package com.Syntax.class05;
/*1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // got to facebook website
        driver.get("https://www.facebook.com/");

        //maximize
        driver.manage().window().maximize();

        //find the element "Create new account button" by xpath
        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();

        Thread.sleep(3000);

        //find the element first name field by name
        driver.findElement(By.name("firstname")).sendKeys("Alena");

        //find the element last name field by name
        driver.findElement(By.name("lastname")).sendKeys("Nizhnik");

        //find the element email field by css selector
        driver.findElement(By.cssSelector("input[aria-label= 'Mobile number or email']")).sendKeys("elenanij@gmail.com");

        //find the element reenter your email by css selector
        driver.findElement(By.cssSelector("input[aria-label*= 'Re-enter']")).sendKeys("elenanij@gmail.com");

        //find the element new password field by xpath
        driver.findElement(By.xpath("//input[@aria-label = 'New password']")).sendKeys("112233");

        //find dropdown webelement for month with css selector
        WebElement month = driver.findElement(By.cssSelector("#month"));

        //use select class
        Select selectM = new Select(month);

        //select an option by value
        selectM.selectByValue("8");

        //find dropdown webelement for birthday with css selector
        WebElement birthday = driver.findElement(By.cssSelector("#day"));

        //use select class
        Select selectD = new Select(birthday);

        //select an option by value
        selectD.selectByValue("23");

        //find dropdown webelement for birth year with css selector
        WebElement year = driver.findElement(By.cssSelector("#year"));

        //use select class
        Select selectY = new Select(year);

        //select an option by visible text
        selectY.selectByVisibleText("1994");

        //find web element to select gender and click the radio button
        driver.findElement(By.cssSelector("input[value = '1']")).click();
    }
}
