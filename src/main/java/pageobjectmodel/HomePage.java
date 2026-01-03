package pageobjectmodel;
import commonComponents.Abstractclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Abstractclass
{
    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //driver.findElement(By.xpath("//a[text()='Leads']")).click();

    @FindBy(xpath = "//a[text()='Leads']")
    WebElement clickLeads;

    public void clickLeadsTab()
    {
        waitForWebElement(clickLeads);
        clickLeads.click();
    }


}
