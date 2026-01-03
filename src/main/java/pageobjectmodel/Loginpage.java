package pageobjectmodel;
import commonComponents.Abstractclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Abstractclass
{
    WebDriver driver;
    public Loginpage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@class='decorativeSubmit']")
    WebElement clickLogin;

    @FindBy(id = "username")
    WebElement enteringUsername;

    @FindBy(id = "password")
    WebElement enteringPassword;

    @FindBy(xpath = "//form//p//label[.='Username']")
    WebElement gettingUserText;

    @FindBy(xpath = "//form//p//label[.='Password']")
    WebElement gettingPasswordText;

    public String sendingUsertext()
    {
        return gettingUserText.getText();
    }

    public String sendingPasswordtext()
    {
        return gettingPasswordText.getText();
    }

    public void login(String u,String p)
    {
        enteringUsername.sendKeys(u);
        enteringPassword.sendKeys(p);
    }
    public void clickLogin()
    {
        clickLogin.click();
    }
}
