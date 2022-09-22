package com.makersacademy.acebook.model;

import com.github.javafaker.Faker;
import com.makersacademy.acebook.Application;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)

public class LoginTest {

    WebDriver driver;
    Faker faker;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        faker = new Faker();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void successfulLoginRedirectsToPosts() {
        // Test Values
        String RN = "Random Name";
        String RP = "Random Password";

        // Mocks Creating User
        driver.get("http://localhost:8080/users/new");
        driver.findElement(By.id("username")).sendKeys(RN);
        driver.findElement(By.id("password")).sendKeys(RP);
        driver.findElement(By.id("submit")).click();

        // Mocks Logging in
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("username")).sendKeys(RN);
        driver.findElement(By.id("password")).sendKeys(RP);
        driver.findElement(By.className("btn")).click();

        // Asserts Login success by getting title of page
        String title = driver.getTitle();
        Assert.assertEquals("Winklevoss", title);
    }
}
