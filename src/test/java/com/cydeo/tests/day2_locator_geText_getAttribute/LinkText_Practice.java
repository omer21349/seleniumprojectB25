package com.cydeo.tests.day2_locator_geText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink =driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();
        String expectedTitle="No A/B Test";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("title verification 1. PASS!");
        }else {
            System.out.println("Title verification 1. FAILED!!!");
        }
        driver.navigate().back();
        actualTitle=driver.getTitle();
        expectedTitle="Practice";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("title verification 2. PASS!");
        }else {
            System.out.println("Title verification 2. FAILED!!!");
        }


    }
}
