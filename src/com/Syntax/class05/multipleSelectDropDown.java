package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDown {


        public static void main (String[]args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

            driver.manage().window().maximize();

            WebElement DD = driver.findElement(By.xpath("//select[@id ='multi-select' ]"));

            Select sel = new Select(DD);

            sel.selectByVisibleText("Texas");

            sel.selectByIndex(3);

            sel.deselectByValue("Texas");

            List<WebElement> states = sel.getOptions();

            for(int i =0; i< states.size(); i++) {

                sel.selectByIndex(i);
            }

            sel.deselectAll();

            //how can you check if the drop down is multi select or not, using selenium?

            boolean multi = sel.isMultiple();

            System.out.println(multi);


        }
    }

