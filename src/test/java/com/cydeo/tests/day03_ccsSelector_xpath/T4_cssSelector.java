package com.cydeo.tests.day03_ccsSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement findRestButton=driver.findElement(By.cssSelector("button[class='login-btn']"));
        String actualResetButtonName=findRestButton.getText();
        String expectedResetButtonName="Reset password";
        if(actualResetButtonName.equals(expectedResetButtonName)){
            System.out.println("Valid Button name: "+actualResetButtonName);
        }else {
            System.err.println("Invalid Button name: "+actualResetButtonName);;
        }

    }
}
