package org.leafground;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
public class Leafground
{
    // accessing pojo
    public Datacenter datacenter = new Datacenter();
    @Test(priority = 1)
    public void testcase1() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys(datacenter.getCompanyname());
        Thread.sleep(5000);
        String getName = name.getAttribute("value");
        System.out.println("getname :"+getName);
        System.out.println((getName.equals(datacenter.getCompanyname())) ? "Name is Verified" : "Name is Not Verified");
        driver.quit();
    }

    @Test(priority = 2)
    public void testcase2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement countryField = driver.findElement(By.id("j_idt106:float-input"));
        countryField.sendKeys(datacenter.getCountry());
        String getCountryField = countryField.getAttribute("value");
        System.out.println(getCountryField.equals(datacenter.getCountry()) ? "Country is verified" : "Country is not Verified");
        driver.quit();
    }

    @Test(priority = 3)
    public void testcase3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement disabledField  = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));
        String getAtrributeOfDisabled = disabledField.getAttribute("aria-disabled");
        System.out.println(getAtrributeOfDisabled.equals("true") ? "Field is Disabled" : "Field is Not Disabled");
        driver.quit();
    }

    @Test(priority = 4)
    public void testcase4()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement clearField = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
        clearField.clear();
        String isCleared = clearField.getAttribute("value");
        System.out.println((isCleared.equals("") ? "Cleared " : "Not Cleared"));
        driver.quit();
    }

    @Test(priority = 5)
    public void testcas5()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement retriveField = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']"));
        String retrive = retriveField.getAttribute("value");
        System.out.println((retrive!=null) ? retrive : "Not retrieved");
        driver.quit();
    }

    @Test(priority = 6)
    public void testcase6()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement emailField = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
        emailField.sendKeys(datacenter.getEmail());
        emailField.sendKeys(Keys.TAB);
        String getAtributeofEmailField = emailField.getAttribute("class");
        System.out.println((getAtributeofEmailField.contains("ui-state-default")) ? "Cursor Moved " : "Cursor not moved");
        driver.quit();
    }

    @Test(priority = 7)
    public void testcase7()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement aboutField = driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
        aboutField.sendKeys(datacenter.getAbout());
        String getAttributes = aboutField.getAttribute("value");
        System.out.println((getAttributes.equals(datacenter.getAbout())) ? "About Text is Verified" : "About Text is not Verified");
        driver.quit();
    }

    @Test(priority = 8)
    public void testcase8()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement italicField = driver.findElement(By.xpath("(//button[@class='ql-italic'])[1]"));
        italicField.click();
        WebElement textField = driver.findElement(By.xpath("//div[contains(@class,'ql-editor')]//em"));
        textField.sendKeys(datacenter.getLorem());
        String styles = textField.getCssValue("font-style");
        System.out.println(styles);
        System.out.println((styles.equals("italic") ? "In italic format" : "Not in Italic Format"));
        driver.quit();
    }

    @Test(priority = 9)
    public void testcase9() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement ageField = driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
        ageField.sendKeys(Keys.ENTER);
        Thread.sleep(3000L);
        WebElement errorField = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(errorField)).click();
        String getError = errorField.getText();
        System.out.println((getError.equals("Age is mandatory") ? "Age : Error is printing✅" : "Age : Error is Error❌"));
        driver.quit();
    }

    @Test(priority = 10)
    public void testcase10() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement labelField = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
        labelField.click();
        Thread.sleep(2000L);
        String getLablePosition = labelField.getAttribute("class");
        System.out.println((getLablePosition.contains("ui-state-hover") ? "Label : Label is moved✅" : "Label is not moved❌"));
        driver.quit();
    }

    @Test(priority = 11)
    public void testcase11() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement nameField = driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
        nameField.sendKeys(datacenter.getName());
        WebElement downdrop = driver.findElement(By.xpath("(//span[@id='j_idt106:auto-complete_panel']//ul//li)[4]"));
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(downdrop)).click();
        Thread.sleep(2000);
        WebElement nameBoxed = driver.findElement(By.xpath("//span[@class='ui-autocomplete-token-label']"));
        Thread.sleep(2000L);
        String getText1 = nameBoxed.getText();
        System.out.println(getText1);
        System.out.println((getText1.contains(datacenter.getName()) ? "Name : 3rd is selected✅" : "Name : 3rd is not selected"));
        driver.quit();
    }

    @Test(priority = 12)
    public void testcase12() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement calenderField = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
        calenderField.click();
        WebElement calender = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt116_panel']"));
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(calender));
     //  WebElement previousBtn = driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']"));
        for(int i = 1;i<=271;i++)
        {
            WebElement previousBtn = driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']"));
            previousBtn.click();
        }
        WebElement currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        System.out.println(currentMonth.getText());
        if(currentMonth.getText().equals("July"))
        {
            WebElement dateField = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[.='4']"));
            dateField.click();
            WebElement finaldatafield = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
            String dob = finaldatafield.getAttribute("value");
            System.out.println((dob.equals("7/4/2003") ? "DOB : DOB is verified" : "DOB is  not verified"));
            driver.quit();
        }
       else
        {
            System.out.println("Wrong Month");
        }
    }

    @Test(priority = 13)
    public void testcase13() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement spinField = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
        spinField.sendKeys(datacenter.getNumber());
        WebElement upField = driver.findElement(By.xpath("(//a[contains(@class,'ui-spinner-up')]//span)[1]"));
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(200L);
            upField.click();
        }
        int num1 = Integer.parseInt(datacenter.getNumber())+20;
        int num2 = Integer.parseInt(spinField.getAttribute("aria-valuenow"));
        System.out.println("Num1 : "+num1+" Num2 : "+num2);
        System.out.println((num1 == num2) ? "increment : increment is verified✅" : "increment : increment is not Verified");
//        driver.quit();
    }

    @Test(priority = 14)
    public void testcase14()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement sliderField = driver.findElement(By.xpath("//input[@id='j_idt106:slider']"));
        sliderField.sendKeys(datacenter.getNumber());
        WebElement levelField = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
        String level = levelField.getAttribute("style");
        System.out.println(level);
        String value = sliderField.getAttribute("value");
        System.out.println((value.equals(datacenter.getNumber()) ? "Slider : Slider is verified✅" : "Slider is not Verified❌"));
        driver.quit();
    }

    @Test(priority = 15)
    public void testcase15()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement popupField = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']"));
        popupField.click();
        try
        {
            WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(5));
            WebElement keyboard = driver.findElement(By.xpath("//div[contains(@class,'keypad-popup')]"));
            wait.until(ExpectedConditions.visibilityOf(keyboard));
            System.out.println("Keyboard : Keyboard is present✅");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage()+" keyboard is not present❌");
        }
        driver.quit();
    }

    @Test(priority = 16)
    public void testcase16()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        // Click inside editor first
        WebElement editor = driver.findElement(
                By.xpath("(//div[contains(@class,'ql-editor')])[2]"));
        editor.click();
        WebElement boldField = driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]"));
        boldField.click();
        String checkBold = boldField.getAttribute("class");
        System.out.println((checkBold.contains("ql-active") ? "Bold is enabled" : "Bold is disabled"));
        WebElement typeField = driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[2]//strong"));
        typeField.sendKeys(datacenter.getLorem());
        System.out.println((typeField.getTagName().equals("strong") ? "Bold : Font is Bold" : "Bold : Font is not Bold"));
        driver.quit();
    }
}
