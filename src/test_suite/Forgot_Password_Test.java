package test_suite;

/**
 * Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfull
 * y
 * <p>
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browser_factory.Base_Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Forgot_Password_Test extends Base_Test {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfull() {

        //find the element forgot password and click it
        driver.findElement(By.className("orangehrm-login-forgot-header")).click();

        //verify text reset password
        //declaring expectedtext variable
        String expectedText = "Reset Password";

        //finding element
        WebElement actualTextElement = driver.findElement(By.xpath("//h6"));
        String actualText = actualTextElement.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
