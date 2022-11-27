package com.Syntax.class08;

/*go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //click on checkbox

        WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));

        checkBox.click();

        //click on remove

        WebElement removeBtn = driver.findElement(By.xpath("//button[text()= 'Remove']"));

        removeBtn.click();

        //verify the text

        String text = driver.findElement(By.id("message")).getText();

        if (text.equals("It's gone!")) {

            System.out.println("Text verified: " + text);
        } else {

            System.out.println("Message is not verified");
        }

        //click on enable

        WebElement enableBtn = driver.findElement(By.xpath("//button[text() = 'Enable']"));

        enableBtn.click();

        WebElement textBox = driver.findElement(By.xpath("//input[@type = 'text']"));

        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.elementToBeClickable(textBox));

        textBox.click();

   /*     //verify the textbox is enabled
        WebElement textBox = driver.findElement(By.xpath("//input[@type = 'text']"));

        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#message")));

        WebElement message = driver.findElement(By.cssSelector("#message"));

        if (message.getText().equals("It's enabled!")) {

            textBox.sendKeys("hello");
        }
        WebElement disableBtn = driver.findElement(By.xpath("//button[text() = 'Disable']"));

        disableBtn.click();

        WebDriverWait wait2 = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#message")));

        WebElement message2 = driver.findElement(By.cssSelector("#message"));


        if (message2.getText().equals("It's disabled!")) {

            System.out.println("Text box is disabled");
            ;
        }*/



       /* WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.elementToBeClickable(textBox));

*/


    }
}
