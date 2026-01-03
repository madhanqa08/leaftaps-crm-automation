package pageobjectmodel;
import commonComponents.Abstractclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class ViewLeadPage extends Abstractclass
{
    public WebDriver driver;
    public ViewLeadPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //   String verify_company_name = driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//table//tbody//tr//td[2])[1]")).getText();
    //        if (verify_company_name.contains(company_name))
    //        {
    //            System.out.println("Company name verified");
    //        }
    //        String verify_firstname = driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//table//tbody//tr[2]//td[2])[1]")).getText();
    //        if(verify_firstname.equalsIgnoreCase(first_name))
    //        {
    //            System.out.println("First name is Verified");
    //        }
    //        String verify_lastname = driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//table//tbody//tr//td[4])[1]")).getText();
    //        if(verify_lastname.equalsIgnoreCase(last_name))
    //        {
    //            System.out.println("Last name is verified");
    //        }

    By companyName = By.xpath("(//div[@class='fieldgroup-body']//table//tbody//tr//td[2])[1]");

    By firstName = By.xpath("(//div[@class='fieldgroup-body']//table//tbody//tr[2]//td[2])[1]");

    By lastName = By.xpath("(//div[@class='fieldgroup-body']//table//tbody//tr//td[4])[1]");

    public String gettingCompanyname()
    {
        waitForElementBY(companyName);
        return driver.findElement(companyName).getText();
    }

    public String gettingfirstname()
    {
        waitForElementBY(firstName);
        return driver.findElement(firstName).getText();
    }

    public String gettinglastname()
    {
        waitForElementBY(lastName);
        return driver.findElement(lastName).getText();
    }


}
