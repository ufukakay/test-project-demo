package com.ufukakay.testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUpload extends TestBaseClass {

    @Test
    public void uploadAddPicture() throws InterruptedException {
        WebElement selectButton = driver.findElement(By.id("input-4"));
        selectButton.sendKeys("C:\\Users\\Impos\\Desktop\\silikon_vadisi_korsanlari_1.jpg");
        Thread.sleep(5000);

    }

    @Test(dependsOnMethods = {"uploadAddPicture"})
    public void uploadDeletePicture() throws InterruptedException {
        WebElement selectButton = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        selectButton.click();
    }

    @Test(dependsOnMethods = {"uploadDeletePicture"})
    public void homePage(){
        WebElement homeButton = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        homeButton.click();
 
           
    }

}
