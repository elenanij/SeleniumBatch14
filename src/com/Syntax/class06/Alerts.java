package com.Syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        driver.manage().window().maximize();

        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick = 'myAlertFunction()']"));

        simpleAlert.click();

        Thread.sleep(2000);

        Alert simpleAlert1 = driver.switchTo().alert();

        simpleAlert1.accept();

        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));

        confirmationAlert.click();

        Alert confirmationAlert1 = driver.switchTo().alert();

        confirmationAlert1.dismiss();


        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']"));

        promptAlert.click();


        Alert promptAlert1 = driver.switchTo().alert();

        Thread.sleep(2000);

        promptAlert1.sendKeys("Alena");

        Thread.sleep(2000);

        promptAlert1.accept();


    }
}
