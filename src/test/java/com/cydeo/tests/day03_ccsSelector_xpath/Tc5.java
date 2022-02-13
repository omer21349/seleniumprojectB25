package com.cydeo.tests.day03_ccsSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc5 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://vytrack.com/");
        WebElement findHomeButton=driver.findElement(By.cssSelector("a[aria-current='page']"));
        boolean homeDisplayed= findHomeButton.isDisplayed();
        System.out.println(homeDisplayed);
        /*String actualButtonName=findHomeButton.getText();
        String expectedButtonName="Home";
        if(actualButtonName.equals(expectedButtonName)){
            System.out.println("Valid Name: "+actualButtonName);
        }else {
            System.out.println("Invalid Name: "+actualButtonName);
        }*/
         //       /tagName[@attribute='value']
        //       //tagName[@attribute='value']


                //tagName[attribute='value']

    }
}
/*
TC:1 As a user I should be able to see Home is displayed
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-verify Home is displayed
 */