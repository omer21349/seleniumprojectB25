package com.cydeo.tests.day2_locator_geText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https:www.google.com");
        System.out.println(driver.getTitle());

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("omer");
        System.out.println("searchBox tag name = " + searchBox.getTagName());
        String getValue=searchBox.getAttribute("value");
        System.out.println(getValue);
        //searchBox.submit();
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));


    }
}
