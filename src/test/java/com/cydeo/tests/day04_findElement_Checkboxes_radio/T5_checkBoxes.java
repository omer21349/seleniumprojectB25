package com.cydeo.tests.day04_findElement_Checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkTheButtonSelected1=driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkTheButtonSelected2=driver.findElement(By.xpath("//input[@name='checkbox2']"));


        System.out.println("checkTheButtonSelected1.isSelected() = " + checkTheButtonSelected1.isSelected());

        System.out.println("checkTheButtonSelected2.isSelected() = " + checkTheButtonSelected2.isSelected());

        Thread.sleep(2000);
        checkTheButtonSelected1.click();

        Thread.sleep(2000);
        checkTheButtonSelected2.click();


        System.out.println("checkTheButtonSelected1 = " + checkTheButtonSelected1.isSelected());
        System.out.println("checkTheButtonSelected2 = " + checkTheButtonSelected2.isSelected());






    }
}
/*
Practice: Checkboxes
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */