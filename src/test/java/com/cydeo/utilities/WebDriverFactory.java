package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {


    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;
        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
              driver.manage().window().maximize();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                  driver= new EdgeDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new RuntimeException("invalid browser type");
        }return driver;
    }





}
