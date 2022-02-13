package com.cydeo.tests.day03_ccsSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_GetAttribute_cssSelector {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com");

        WebElement logInButton=driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedBtnName="Log In";
        String actualBtnName=logInButton.getAttribute("value");
        if(actualBtnName.equals(expectedBtnName)){
            System.out.println("Valid Button name: "+actualBtnName);
        }else {
            System.err.println("Invalid Button name: "+actualBtnName);
        }

    }
}
