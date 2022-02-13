package com.cydeo.tests.day03_ccsSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc6HomeWork {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
       WebElement findAboutButton=driver.findElement(By.xpath("//a[@href='https://vytrack.com/about-us/\']"));
       boolean displayAboutButton=findAboutButton.isDisplayed();
        System.out.println(displayAboutButton);



    }
}
/*



TC:2 As a user I should be able to see About is displayed
 //1-open a chrome browser
 //2-goto https://vytrack.com/
 //3-verify About us is displayed
 */