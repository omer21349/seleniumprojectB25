package com.cydeo.tests.day2_locator_geText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        WebElement findSearchBtn=driver.findElement(By.id("global-enhancements-search-query"));
        findSearchBtn.sendKeys("wooden spoon");
        findSearchBtn.submit();
        String expectedTile=driver.getTitle();
        String actualTitle="Wooden spoon | Etsy";

        if(expectedTile.equals(actualTitle)){
            System.out.println("title is verified");
        }else {
            System.err.println("title is not verified");
        }





    }

}
/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */