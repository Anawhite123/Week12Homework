package testsuite;

import Browserfactory.Utility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

//1.userShouldLoginSuccessfullyWithValidCredentials
//        * Enter valid username
//        * Enter valid password
//        * Click on ‘LOGIN’ button
//        * Verify the ‘Accounts Overview’ text is display
//        2.verifyTheErrorMessage
//        * Enter invalid username
//        * Enter invalid password
//        * Click on Login button
//        * Verify the error message ‘The username and password could not be verified.’
//
//        3.userShouldLogOutSuccessfully
//        * Enter valid username
//        * Enter valid password
//        * Click on ‘LOGIN’ button
//        * Click on ‘Log Out’ link
//        * Verify the text ‘Customer Login’
public class LoginTest extends Utility {
    String Baseurl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUrl() {
        openBrowser(Baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        sendKeysToElement(By.xpath("//input[@type='text']"), "Anvika6767");
        sendKeysToElement(By.xpath("//input[@type='password']"), "Ana689");
        clickOneElement(By.xpath("//input[@type='submit']"));
        String actualOverview = getTextfromelement(By.xpath("//div[@class='ng-scope']/div/h1"));
        String expectedOverview = "Accounts Overview";
        Assert.assertEquals("verify Text", actualOverview, expectedOverview);
    }

    @Test
    public void invalidCredentials() {
        sendKeysToElement(By.xpath("//input[@type='text']"), "Anvika");
        sendKeysToElement(By.xpath("//input[@type='password']"), "Ana3");
        clickOneElement(By.xpath("//input[@type='submit']"));
        String actualOverview = getTextfromelement(By.xpath("//p[@class='caption']"));
        String expectedOverview = "Experience the difference";
        Assert.assertEquals("verify Text", actualOverview, expectedOverview);
    }


}


//         @Test
//         public void logout(){
//             sendKeysToElement(By.xpath("//input[@type='text']"),"Anvika6767");
//             sendKeysToElement(By.xpath("//input[@type='password']"),"Ana689");
//             clickOneElement(By.xpath("//input[@type='submit']"));
//         clickOneElement(By.xpath("//div[@id='bodyPanel']/div[1]/ul[1]/li[8]/a"));//user is able to Logout Successfully
//          String actualLogin = getTextfromelement(By.xpath("//div[@id='leftPanel']/h2")) ;//Verify Customer Login   text
//          String expectedLogin= "Customer Login";
//          Assert.assertEquals("verify Text",actualLogin,expectedLogin);
//
//
















































