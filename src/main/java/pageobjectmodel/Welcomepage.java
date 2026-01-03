package pageobjectmodel;

import commonComponents.Abstractclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage extends Abstractclass
{
    WebDriver driver;

    private By crmLink = By.linkText("CRM/SFA");
    private By crmText = By.xpath("//div[@id='label']//a");

    public Welcomepage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String gettingCRMText()
    {
        waitForElementBY(crmText);
        return driver.findElement(crmText).getText();
    }

    public void clickCRM()
    {
        waitForElementBY(crmText);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(crmLink));
    }
}
