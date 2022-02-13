package com.cydeo.tests.day2_locator_geText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement getHeader=driver.findElement(By.tagName("h3"));
        String actualHeaderName=getHeader.getText();
        String expectedHeaderName="Log in to ZeroBank";
        if(actualHeaderName.equals(expectedHeaderName)){
            System.out.println("Valid header Name");
        }else {
            System.out.println("invalid header name");
        }








    }


}
/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */