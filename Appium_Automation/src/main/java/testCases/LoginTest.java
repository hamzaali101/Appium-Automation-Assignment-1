package testCases;

import baseTest.appFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.loginPage;

import java.net.MalformedURLException;

public class LoginTest {

    private loginPage logPage;

    @BeforeTest
    public void setup() throws MalformedURLException{
        appFactory.initializer();
        logPage = new loginPage();
    }

    @Test
    public void verifyUserCreation() throws InterruptedException{
        logPage.clickCreateAccountBtn();
        Thread.sleep(3000);

    }

    @AfterTest
    public void Teardown(){
        appFactory.quictDriver();
    }
}
