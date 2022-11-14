package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

        //get the webElement text box

        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));

        textBox.sendKeys("Abracadabra");

        WebElement button = driver.findElement(By.cssSelector("button[onclick ^= 'showIn']"));

        button.click();

//radio buttons

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@name = 'optradio' and @value = 'Male']"));

        //check if radio button is displayed

        boolean maleDisplayStatus = maleRadioButton.isDisplayed();

        System.out.println("The radio button is displayed: "+ maleDisplayStatus);

        //check whether the male radio button is enabled

       boolean maleEnabledStatus =  maleRadioButton.isEnabled();

        System.out.println("The radio button is enabled: " + maleEnabledStatus);

        //check whether the male radio button is selected//

        boolean maleSelectStatus = maleRadioButton.isSelected();
        System.out.println("The radio button is selected: " + maleSelectStatus);

        //check if the radio button male is not selected then click on it

        if(!maleSelectStatus) {

            maleRadioButton.click();
        }


        maleSelectStatus = maleRadioButton.isSelected();

        System.out.println("The radio button is selected: " + maleSelectStatus);
    }
}
