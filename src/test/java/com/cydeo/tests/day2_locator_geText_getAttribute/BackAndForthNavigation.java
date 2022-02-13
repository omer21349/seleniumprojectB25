package com.cydeo.tests.day2_locator_geText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement clickTheGmail=driver.findElement(By.className("gb_d"));
        clickTheGmail.click();
        String actualTitle = driver.getTitle();
        String expectedTitle="Gmail";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("valid title: "+actualTitle);
        }else {
            System.err.println("invalid title: "+actualTitle);
        }
        driver.navigate().back();
        String lastActualTitle=driver.getTitle();
        String lastExpectedTitle="Google";

        if (lastActualTitle.equals(lastExpectedTitle)){
            System.out.println("Valid Title: "+lastActualTitle);
        }else {
            System.err.println("Invalid Title: "+lastActualTitle);
        }

    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
 */