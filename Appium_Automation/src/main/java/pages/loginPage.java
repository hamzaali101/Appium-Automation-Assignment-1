package pages;
import baseTest.appDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {
    public loginPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);
    }


    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement pageHeader;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement SignInBtn;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement createAccountBtn;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement email;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement cont;



    By by_pageheader = By.id("com.booking:id/identity_header_title");

    public void enterValidEmailAddress(){
        new WebDriverWait(appDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_pageheader));
        email.sendKeys("hamza@gmail.com");
    }
    public void clickCreateAccountBtn(){
        createAccountBtn.click();
    }

    public void clickContBtn(){
        cont.click();
    }

}