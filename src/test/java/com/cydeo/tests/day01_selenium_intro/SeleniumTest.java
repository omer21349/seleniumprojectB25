package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException{

        //1- Setting up the web driver manager
        // we have to enter this line every time we want to open chrome
        //so here we say to webdrivermanager, can you make chrome ready for me for automation
        WebDriverManager.chromedriver().setup();

        //Create instance of the chrome driver
        //so we crate an object, which we set up, now we create object
        WebDriver driver= new ChromeDriver();// so in this case we open the chrome,

        driver.manage().window().maximize();

        //driver.manage().window().fullscreen(); //this also same thing also but for some Windows user its not working

        //3- Test if driver is working as expected
        //after we crate objet here we put the website(url) in the object with calling the driver.get
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");
        currentTitle= driver.getTitle();
        currentURL= driver.getCurrentUrl();

       // System.out.println("driver.getTitle() = " + driver.getTitle());


        System.out.println("currentTitle = " + currentTitle);


        System.out.println("currentURL = " + currentURL);

        driver.close();

    }
}
