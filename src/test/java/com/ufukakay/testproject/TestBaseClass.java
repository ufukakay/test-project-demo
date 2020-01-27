package com.ufukakay.testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class TestBaseClass {

    WebDriver driver;

    @BeforeClass
    public void setUpSite(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Impos\\test-project-1\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/FileUpload.html");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeTest(){
        driver.quit();
    }

    }

