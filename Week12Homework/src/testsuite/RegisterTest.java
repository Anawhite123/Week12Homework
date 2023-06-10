package testsuite;

import Browserfactory.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

//1.verifyThatSigningUpPageDisplay
//        * click on the ‘Register’ link
//        * Verify the text ‘Signing up is easy!’
// 2.userSholdRegisterAccountSuccessfully
//        * click on the ‘Register’ link
//        * Enter First name
//        * Enter Last name
//        * Enter Address
//        * Enter City
//        * Enter State
//        * Enter Zip Code
//        * Enter Phone
//        * Enter SSN
//        * Enter Username
//        * Enter Password
//        * Enter Confirm
//        * Click on REGISTER button
//        * Verify the text 'Your account was created successfully. You are now logged in.’
public class RegisterTest extends Utility {
    String BaseUrl="https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void setup(){
        openBrowser(BaseUrl);
    }
@Test
    public void verifyThatSigningUpPageDisplay(){
    clickOneElement(By.xpath("//div[@id='loginPanel']/p[2]/a"));
    String actualpage = getTextfromelement(By.xpath("//div[@id='rightPanel']/h1"));
    String expectedpage="Signing up is easy!";
    Assert.assertEquals("verify the text",actualpage,expectedpage);
    }
    @Test
public  void userShouldRegisterAccountSuccessfully(){// use of SendKeys method available in utilityClass
        clickOneElement(By.xpath("//div[@id='loginPanel']/p[2]/a"));
        sendKeysToElement(By.xpath("//input[@id='customer.firstName']"),"Ana Megan");
        sendKeysToElement(By.xpath("//input[@id='customer.lastName']"),"Mars");
        sendKeysToElement(By.xpath("//input[@id='customer.address.street']"),"13,Brighten Drive");
        sendKeysToElement(By.xpath("//input[@id='customer.address.city']"),"Brighton way");
        sendKeysToElement(By.xpath("//input[@id='customer.address.state']"),"Wales");
        sendKeysToElement(By.xpath("//input[@id='customer.address.zipCode']"),"12387");
        sendKeysToElement(By.cssSelector("input[id='customer.phoneNumber']"),"01234675558");
        sendKeysToElement(By.xpath("//input[@id='customer.ssn']"),"123456155");
        sendKeysToElement(By.xpath("//input[@id='customer.username']"),"Ana6767");
        sendKeysToElement(By.xpath("//input[@id='customer.password']"),"Ana1231236");
        sendKeysToElement(By.id("repeatedPassword"),"Ana1231236");
        clickOneElement(By.xpath("//td[@colspan='2']/input[1]"));
        String actualloginText = getTextfromelement(By.xpath("//div[@id='rightPanel']/p"));
        String expectedloginText="Your account was created successfully. You are now logged in.";
        Assert.assertEquals("verification of Text,",actualloginText,expectedloginText);
        }
        @After
    public void teardown(){
        closeBrowser();
    }
}