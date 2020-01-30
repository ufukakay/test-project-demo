package com.ufukakay.testproject;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUploadTest extends TestBaseClass {


    @Test
    public void uploadTruePath() throws InterruptedException {
        WebElement selectButton = driver.findElement(By.id("input-4"));
        selectButton.sendKeys("C:\\Users\\Impos\\Desktop\\silikon_vadisi_korsanlari_1.jpg");
        Thread.sleep(5000);
        WebElement viewButton = driver.findElement(By.cssSelector("button[title^='View']"));
        String viewTitle = viewButton.getAttribute("title");
        Assert.assertEquals(viewTitle, "View Details");
    }

    @Test(dependsOnMethods = {"uploadTruePath"})
    public void uploadDeletePicture() throws InterruptedException {
        WebElement selectButton = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        selectButton.click();
    }

    @Test(dependsOnMethods = {"uploadDeletePicture"})
    public void uploadFalsePath() throws InterruptedException {
        try {
            WebElement selectButton = driver.findElement(By.id("input-4"));
            selectButton.sendKeys("Wrong Path");
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }

    }


}
