package com.cydeo.tests.day03_ccsSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
        WebElement userName= driver.findElement(By.className("login-inp"));
        userName.sendKeys("incorrect");
        WebElement password=driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        WebElement clickButton=driver.findElement(By.className("login-btn"));
        clickButton.click();
        WebElement errorMessage=driver.findElement(By.className("errortext"));
        String actualMessage =errorMessage.getText();
        String expectedMessage="Incorrect login or password";
        if(actualMessage.equals(expectedMessage)){
            System.err.println("invalid password or userName");
        }else {
            System.out.println("valid password");
        }







    }
}
