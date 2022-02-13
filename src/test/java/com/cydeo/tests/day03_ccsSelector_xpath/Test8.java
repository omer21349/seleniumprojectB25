package com.cydeo.tests.day03_ccsSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
        WebElement logInButton=driver.findElement(By.cssSelector("a[href='http://app.vytrack.com']"));
        logInButton.click();
        String actualURL=driver.getCurrentUrl();
        String expectedURL="login";
        if(actualURL.contains(expectedURL)){
            System.out.println("Valid URL: "+actualURL);
        }else {
            System.out.println("Invalid URL: "+actualURL);
        }
        driver.quit();


    }
}
/*
TC:5 As a user I should be able to see the login page
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-click Login label
 //4-verify the url contains login
 */