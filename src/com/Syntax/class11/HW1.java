package com.Syntax.class11;

/*goto https://demo.guru99.com/test/simple_context_menu.html
right click  on the button, select edit and handle the alert

double click on the button and handle the alert*/

import com.Syntax.utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.Syntax.utils.CommonMethods.driver;

public class HW1 {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("https://demo.guru99.com/test/simple_context_menu.html");

        //close CCPA alert

        WebElement CCPAFrame = driver.findElement(By.xpath("//iframe[@id = 'ccpa-consent-notice']"));

       driver.switchTo().frame(CCPAFrame);

       WebElement closeAlertBtn = driver.findElement(By.xpath("//mat-icon[text() = 'close']"));

       closeAlertBtn.click();

       //right click  on the button, select edit

        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text() = 'right click me']"));

        Actions actions = new Actions(driver);

        actions.contextClick(rightClickBtn).click(driver.findElement(By.xpath("//span[text() = 'Edit']"))).build().perform();

        //handle the alert

        Alert alert = driver.switchTo().alert();

        alert.accept();

       // double click on the button and handle the alert*/

WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));

actions.doubleClick(doubleClickBtn).perform();

Alert alert1 = driver.switchTo().alert();

alert1.accept();

    }
}
