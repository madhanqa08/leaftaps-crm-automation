package org.leafground;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
public class Baseclass
{
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void startup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
    }
    @AfterMethod
    public void endup()
    {
        driver.quit();
    }
}
