package commonComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Abstractclass
{
    WebDriver driver;

    public Abstractclass(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void waitForElementBY(By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementtoBeClickable(By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element  =  wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }
    public void waitForWebElement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void presenceofWaitBY(By element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
    public void moveMouse(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void selectbyVisibility(WebElement element,String text)
    {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

}
