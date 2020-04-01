package seleniumProgramme;

import Utility.Utilites1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginEbay1 extends Utilites1 {
    String baseUrl = "https://www.ebay.co.uk/";
    @Before
    public void openBrowser(){
        chromeDriver();
        maximizeWindow();
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }
    @Test
    public void UserShouldLoginEbaySuccessfully() throws InterruptedException {
        clickOnElement(By.xpath("//span[@id='gh-ug']"));
        sleepMethod();
        sendTextToElement(By.xpath("//input[@id='userid']"),"vin_thakor@yahoo.co.uk");

        sendTextToElement(By.xpath("//div[@class='signin-view-container']//div//div[@class='ds6-textbox-container']"),"Myebay2021");
        sleepMethod();
        clickOnElement(By.id("sgnBt"));

        String expectedTex = "GREET-SIGN-IN-TO-EBAY";
        String actualText = getTextFromElement(By.xpath("GREET-SIGN-IN-TO-EBAY"));
        Assert.assertEquals(expectedTex, actualText);

    }
}
