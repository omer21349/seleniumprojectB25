package com.cydeo.tests.day03_ccsSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
        WebElement findContactButton=driver.findElement(By.cssSelector("a[href='https://vytrack.com/contact/']"));
        boolean contactIsDisplayed=findContactButton.isDisplayed();
        System.out.println(contactIsDisplayed);
        String expectedContactText="Contact";
        String actualContactText=findContactButton.getText();
        if (actualContactText.equals(expectedContactText)){
            System.out.println("Contact link verification is Passed!!");
        }else {
            System.out.println("Contact link verification is Failed!!!");
        }



    }
}
/*
TC:3 As a user I should be able to see Contact is displayed
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-verify Contact is displayed and label is "Contact"

 */