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



public class Login extends Utilites1 {

    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void openBrowser() {
        chromeDriver();
        maximizeWindow();
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToLoginPage() throws InterruptedException {
        clickOnElement(By.linkText("Log in"));
        sleepMethod();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1"));
        Assert.assertEquals(expectedText, actualText);
        sendTextToElement(By.xpath("//input[@id='Email']"), "peter@jones123.gmail.com");
        sendTextToElement(By.id("Password"), "Mybook2020");
        clickOnElement(By.xpath("//input[@class='button-1 login-button']"));
    }

    @After
    public void closeBrowser() throws InterruptedException {
        sleepMethod();
       //quitMethod();
    }

}



