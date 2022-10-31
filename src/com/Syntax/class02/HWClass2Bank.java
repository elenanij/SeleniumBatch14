package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass2Bank {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Alena");

        Thread.sleep(300);
        driver.findElement(By.id("customer.lastName")).sendKeys("Nizhnik");
        Thread.sleep(300);

        driver.findElement(By.id("customer.address.street")).sendKeys("2630 Stonecreek drive");
        Thread.sleep(300);

        driver.findElement(By.id("customer.address.city")).sendKeys("Sacramento");
        Thread.sleep(300);

        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        Thread.sleep(300);

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("95833");
        Thread.sleep(300);

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("4243713330");
        Thread.sleep(300);

        driver.findElement(By.id("customer.ssn")).sendKeys("NA");
        Thread.sleep(300);

        driver.findElement(By.id("customer.username")).sendKeys("AlenaN");
        Thread.sleep(300);

        driver.findElement(By.id("customer.password")).sendKeys("12345");
        Thread.sleep(300);

        driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
        Thread.sleep(300);

        driver.findElement(By.className("button")).click();


    }
}
