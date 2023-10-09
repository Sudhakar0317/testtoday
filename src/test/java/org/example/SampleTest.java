package org.example;


import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;


public class SampleTest extends BaseTest {

    String test1url="https://testpages.eviltester.com/styled/basic-html-form-test.html";
    String test2 = "https://testpages.eviltester.com/styled/html5-form-test.html";

    @Test
    public void Test1() throws IOException, InterruptedException {

        test = extent.createTest("test1", "Submit form Validation");
        // perform test1
        test.log(Status.INFO, "Browser Launched");
        test.log(Status.INFO, "Test Stared");

        driver.get(test1url);
        testScenario1();
        try {
            driver.findElement(By.linkText("Go back to the form"));
            test.log(Status.PASS, "You submitted a form");

        } catch (Exception e) {
            test.log(Status.FAIL, "You  have not submitted a form");
        }

    }

    @Test

    public void Test2() throws InterruptedException, IOException {
        test = extent.createTest("test2", "Colur Webpage Submit Form Validation");
        test.log(Status.INFO, "Browser Launched");
        test.log(Status.INFO, "Test Stared");
        // colour
        driver.get(test2);
        test.log(Status.INFO, " test2 Started");
        test2();

        try {
            // submit
            driver.findElement(By.xpath("//div[@class='explanation']"));
            test.log(Status.PASS, "You  have not submitted a form");


        } catch (Exception e) {
            test.log(Status.FAIL, "Login Failed");
        }

        extent.flush();

        driver.quit();


    }
}