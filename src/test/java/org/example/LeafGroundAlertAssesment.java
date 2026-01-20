package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeafGroundAlertAssesment
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/");
        driver.findElement(By.xpath("//li[@id='menuform:j_idt39']//a[@href='#']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement alert = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-clone layout-menuitem-icon']"));
         wait.until(ExpectedConditions.visibilityOf(alert)).click();
         // --------------------Sweet Alert (Simple Dialog)
        WebElement sweet_alert = driver.findElement(By.xpath("//h5[.='Sweet Alert (Simple Dialog)']//following::span"));
        wait.until(ExpectedConditions.elementToBeClickable(sweet_alert)).click();
        WebElement dismiss = driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]"));
        wait.until(ExpectedConditions.elementToBeClickable(dismiss)).click();
        //----------------------Sweet Modal Dialog
        WebElement Sweet_Modal_Dialog = driver.findElement(By.xpath("//h5[.='Sweet Modal Dialog']//following::span"));
        wait.until(ExpectedConditions.visibilityOf(Sweet_Modal_Dialog)).click();
        WebElement close  = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(close)).click();
        //---------------------Sweet Alert (Confirmation)
        WebElement sweet_alert_confirmantion = driver.findElement(By.xpath("//h5[.='Sweet Alert (Confirmation)']//following::span"));
        wait.until(ExpectedConditions.visibilityOf(sweet_alert_confirmantion)).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[.='Yes']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(close)).click();
        //--------------------- Minimize and Maximize
        WebElement min_max =driver.findElement(By.xpath("//h5[.='Minimize and Maximize']//following::span"));
        wait.until(ExpectedConditions.visibilityOf(min_max)).click();
        By x =By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]");
        wait.until(ExpectedConditions.elementToBeClickable(x)).click();
        wait.until(ExpectedConditions.elementToBeClickable(x)).click();
        System.out.println();

    }
}
