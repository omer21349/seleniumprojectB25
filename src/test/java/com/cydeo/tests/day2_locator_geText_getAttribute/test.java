package com.cydeo.tests.day2_locator_geText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        /*String getTitle=driver.getTitle();
        System.out.println(getTitle);

        String getUrl=driver.getCurrentUrl();
        System.out.println(getUrl);*/
        WebElement getElement = driver.findElement(By.name("search_query"));
        getElement.sendKeys("japonic");

        getElement.submit();



    }
}