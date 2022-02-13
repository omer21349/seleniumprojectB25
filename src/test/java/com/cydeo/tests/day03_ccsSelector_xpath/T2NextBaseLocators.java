package com.cydeo.tests.day03_ccsSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2NextBaseLocators {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com");
        WebElement getMessage=driver.findElement(By.className("login-item-checkbox-label"));
        String actualMessage=getMessage.getText();
        String expectedMessage="Remember me on this computer";
        if(actualMessage.equals(expectedMessage)){
            System.out.println("Message verification is Passed!");
        }else {
            System.out.println("Message verification is Failed!!!");
        }
        WebElement getLinkText=driver.findElement(By.className("login-link-forgot-pass"));
        String actualTextMessage=getLinkText.getText();
        String expectedTextMassage="Forgot your password?";
         if(actualTextMessage.equalsIgnoreCase(expectedTextMassage)){
            System.out.println("Message verification Passed!");
        }else {
            System.out.println("Message verification Failed!!!");
        }
         String getActualAttribute=getLinkText.getAttribute("href");
         String expectedAttribute="forgot_password=yes";
         if(getActualAttribute.contains(expectedAttribute)){
             System.out.println("Valid Attribute: "+getActualAttribute);
         }else{
             System.err.println("Invalid Attribute: "+expectedAttribute);
         }





    }
}
