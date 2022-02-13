package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String title = driver.getTitle();

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        if(title.equals(expectedTitle)){
            System.out.println("valid title: "+title);
        }else {
            System.out.println("invalid title: "+title);
        }


    }
}
