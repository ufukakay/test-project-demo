package com.ufukakay.testproject;


import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class LinkTest extends TestBaseClass {



    @Test
    public void dataUrlTest() {

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.hepsiburada.com/");

    }

    @Test(dependsOnMethods = {"dataUrlTest"})
    public void dataLinkTest(){

        String currentUrl= driver.getCurrentUrl();
        System.out.println("Current:" + currentUrl);
        WebElement productSearch = driver.findElement(By.id("productSearch"));
        productSearch.sendKeys("Elma", Keys.ENTER);

        String nextCurrentUrl = driver.getCurrentUrl();
        System.out.println("Next Click Url:" +nextCurrentUrl);
        Assert.assertNotEquals(nextCurrentUrl,currentUrl);
    }


}
