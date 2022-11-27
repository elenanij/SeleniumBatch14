package com.Syntax.class10;

/*Go to syntax hrms .
Go-to the recruitment tab.
From the calendar  just select a date
8 August 2023*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HW1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Go to syntax hrms

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement submitBtn = driver.findElement(By.name("Submit"));
        submitBtn.click();

        //Go-to the recruitment tab
        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()= 'Recruitment']"));

        recruitmentBtn.click();

        //From the calendar  just select a date 8 August 2023
        WebElement calendarBtn = driver.findElement(By.xpath("//img[@class= 'ui-datepicker-trigger']"));

        calendarBtn.click();

        String targetMonth = "Aug";
        String targetDate = "8";
        String targetYear = "2023";

        //select August
        WebElement selectMonth = driver.findElement(By.xpath("//select[@class = 'ui-datepicker-month']"));

        Select select = new Select(selectMonth);

        select.selectByVisibleText(targetMonth);

        //Select 2023
        WebElement selectYear = driver.findElement(By.xpath("//select[@class = 'ui-datepicker-year']"));

        Select selectY = new Select(selectYear);

        selectY.selectByValue(targetYear);

    //select 8th
        WebElement date = driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td/a[text() = " + targetDate + "]"));

        date.click();


    }
}