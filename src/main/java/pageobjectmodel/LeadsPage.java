package pageobjectmodel;
import commonComponents.Abstractclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LeadsPage extends Abstractclass
{
    WebDriver driver;
    public LeadsPage(WebDriver driver)
    {
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    // driver.findElement(By.xpath("//div[@class='frameSectionBody']//ul//a[text()='Create Lead']")).click();


    //Thread.sleep(3000L);
    //        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company_name);
    //        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first_name);
    //        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last_name);
    //        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));

    By companyName = By.id("createLeadForm_companyName");
    By firstName = By.id("createLeadForm_firstName");
    By lastName = By.id("createLeadForm_lastName");

    By clickCreate = By.xpath("//div[@class='frameSectionBody']//ul//a[text()='Create Lead']");

    public void clickCreateLead()
    {
        waitForElementBY(clickCreate);
        driver.findElement(clickCreate).click();
    }
    //   WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
    //        Select select1 = new Select(source);
    //        select1.selectByVisibleText(source_select);

    @FindBy(id = "createLeadForm_dataSourceId")
    WebElement selectSource;



    public void fillDetails(String c,String f,String l,String s)
    {
        waitForElementBY(companyName);
        driver.findElement(companyName).sendKeys(c);
        waitForElementBY(firstName);
        driver.findElement(firstName).sendKeys(f);
        waitForElementBY(lastName);
        driver.findElement(lastName).sendKeys(l);
        selectbyVisibility(selectSource,s);
    }
    @FindBy(xpath = "//div[@class='fieldgroup-body']//table//tbody//input[@class='smallSubmit']")
    WebElement submitButton;

    // WebElement click = driver.findElement(By.xpath("//div[@class='fieldgroup-body']//table//tbody//input[@class='smallSubmit']"));
    //
    //        Actions actions = new Actions(driver);
    //        actions.moveToElement(click).build().perform();
    //        click.click();

    public void clickSubmit()
    {
        moveMouse(submitButton);
        submitButton.click();
    }
}
