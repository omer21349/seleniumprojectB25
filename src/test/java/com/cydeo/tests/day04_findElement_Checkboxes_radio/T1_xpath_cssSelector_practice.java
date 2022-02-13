package com.cydeo.tests.day04_findElement_Checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink1=driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2=driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink3=driver.findElement(By.cssSelector("a[href='/']"));
        WebElement homeLink4=driver.findElement(By.cssSelector("a[href='/']"));
        WebElement header_ex1=driver.findElement(By.cssSelector("div.example>h2"));
        WebElement header_ex2=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement emailLabel=driver.findElement(By.xpath("//label[@for='email']"));
        WebElement inputBox_ex1=driver.findElement(By.xpath("//input[@name='email']"));
        //if
        WebElement inputBox_ex2=driver.findElement(By.xpath("//input[contains(@pattern,'a-z0')]"));

        WebElement retrievePasswordBtn=driver.findElement(By.xpath("//button[@id='from_submit']"));

        WebElement poweredByCydeoText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


    }
}
/*
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
 */