package test_suite;

/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * <p>
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */

import browser_factory.Base_Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Test extends Base_Test {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        //find the user name field and enter the user name
        driver.findElement(By.name("username")).sendKeys("Admin");

        //find the password field and enter the password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //find the login button and click it
        driver.findElement(By.className("orangehrm-login-button")).click();

        //verify dashboard text is displayed
        String expectedText="Dashboard";

        WebElement actualTextElement=driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
        String actualText=actualTextElement.getText();

        Assert.assertEquals(expectedText,actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
