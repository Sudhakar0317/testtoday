package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class LoginPage {

    WebDriver driver;
    public void testScenario1() throws InterruptedException {
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("sudhakar");
        driver.findElement(By.name("password")).sendKeys("WelcomeBank");
        //comments
         WebElement comments =driver.findElement(By.name("comments"));
         comments.clear();
         //check box
         comments.sendKeys("Test");
         WebElement checkbox= driver.findElement(By.xpath("//input[@name='checkboxes[]'][1]"));
         checkbox.click();
         //select class dropdown
        Select Mutiple= new Select(driver.findElement(By.name("multipleselect[]")));
        Mutiple.selectByValue("ms1");

        Select dropdown= new Select(driver.findElement(By.name("dropdown")));
        dropdown.selectByValue("dd1");

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
    }
    public void test2()
    {
        driver.manage().window().maximize();
         WebElement email =driver.findElement(By.name("email"));
         email.clear();
         email.sendKeys("sudhakarreddyd39@gmail.com");

        driver.findElement(By.name("number")).sendKeys("22");
        driver.findElement(By.xpath("//input[@type='submit']")).click();


    }



}
