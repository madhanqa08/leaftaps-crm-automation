package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel.*;
import java.time.Duration;
public class LeadcreationTest
{
    public static String username = "demosalesmanager";
    public static String password = "crmsfa";
    public static String company_name = "Test leaf";
    public static String first_name = "Madhan kumar";
    public static String last_name = "B";
    public static String source_select = "Website";
    @Test
    public void run()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://leaftaps.com/opentaps/control/main");
        Loginpage loginpage = new Loginpage(driver);
        String verify1 = loginpage.sendingUsertext();
        String verify2 = loginpage.sendingPasswordtext();
        Assert.assertEquals(verify1,"Username");
        Assert.assertEquals(verify2,"Password");
        loginpage.login(username,password);
        loginpage.clickLogin();
        Welcomepage welcomepage = new Welcomepage(driver);
        String verify3 = welcomepage.gettingCRMText();
        System.out.println("Verify3 : "+verify3);
        Assert.assertEquals(verify3,"CRM/SFA");
        welcomepage.clickCRM();
        HomePage homePage = new HomePage(driver);
        homePage.clickLeadsTab();
        LeadsPage leadsPage = new LeadsPage(driver);
        leadsPage.clickCreateLead();
        leadsPage.fillDetails(company_name,first_name,last_name,source_select);
        leadsPage.clickSubmit();
//        ------------------------------------------------Verification
        String title = driver.getTitle();
        if (title.contains("View Lead"))
        {
            System.out.println("Title is verified");
        }
        String url = driver.getCurrentUrl();
        if (url.contains("http://leaftaps.com/crmsfa/control/viewLead"))
        {
            System.out.println("Url is verified");
        }
        ViewLeadPage viewLeadPage = new ViewLeadPage(driver);
        String verify_company_name = viewLeadPage.gettingCompanyname();
        if (verify_company_name.contains(company_name))
        {
            System.out.println("Company name verified");
        }
        String verify_firstname = viewLeadPage.gettingfirstname();
        Assert.assertEquals(first_name,verify_firstname);
        String verify_lastname = viewLeadPage.gettinglastname();
        Assert.assertEquals(last_name,verify_lastname);
        driver.close();
    }
}
