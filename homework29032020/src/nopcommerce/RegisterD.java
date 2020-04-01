package nopcommerce;

import Utility.Utilites1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class RegisterD extends Utilites1 {

    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openBrowser() {
        chromeDriver();
        maximizeWindow();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }

    @Test
    public void UserShouldLoginSucessfullyRegister() {

        clickOnElement(By.xpath("//a[@class='ico-register']"));

        String expectedtest = "Your Personal Details";
        String actualText = getTextFromElement(By.xpath("//div[@class='title']//strong[contains(text(),'Your Personal Details')]"));
        Assert.assertEquals(expectedtest, actualText);
    }

    @Test
    public void VerfityUserSholdRegisterSucessfully() throws InterruptedException {

        sleepMethod();

        clickOnElement(By.xpath("//a[@class='ico-register']"));

        clickOnElement(By.xpath("//input[@id='gender-male']"));

        sendTextToElement(By.xpath("//input[@id='FirstName']"),"mytestone");

        sendTextToElement(By.xpath("//input[@id='LastName']"),"forwork");




        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"),"4");



        sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"april");


        sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1994");

        generateRandomEmail(By.id("Email"));
        sendTextToElement(By.xpath("//input[@id='Email']"),"mytest4@gmail.com");


        sendTextToElement(By.xpath("//input[@id='Company']"),"My test for you");


        radioButtonClick(By.xpath("//input[@id='Newsletter']"));


        sendTextToElement(By.xpath("//input[@id='Password']"),"Mytest123");

        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"Mytest123");

        clickOnElement(By.xpath("//input[@name='register-button']"));


        String expectedRegText = "Your registration completed";
        String actualRegPage = getTextFromElement(By.xpath("//div[@class='page-body']//div[text()='Your registration completed']"));
       // String actualRegPage = getTextFromElement(By.xpath("//div[@class='page-body']//div[text()='Your registration completed']"));
        Assert.assertEquals(actualRegPage,expectedRegText);

    }



    @After
    public void closeBrowser() throws InterruptedException {
        sleepMethod();
        driver.quit();
    }
}

