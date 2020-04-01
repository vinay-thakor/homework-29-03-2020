package nopcommerce;

import Utility.Utilites1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.rmi.CORBA.Util;
import java.util.concurrent.TimeUnit;

public class Electronics1 extends Utilites1 {

    private WebDriver driver;
    private JavascriptExecutor jse;
    public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openBrowser() {
        chromeDriver();
        jse = (JavascriptExecutor) driver;
        maximizeWindow();
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }

    @Test
    public void userShouldNavigateToElectronicPage() {

        clickOnElement(By.linkText("Electronics"));

        String expectedText = "Electronics";
        String actualText = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void mouseHovertoElectronicTab() throws InterruptedException {

        moveToElement(By.xpath("//body/div[@class='master-wrapper-page']/div[@class='header-menu']/ul[@class='top-menu notmobile']/li[2]"));

        sleepMethod();

        clickOnElement(By.xpath("//body/div[@class='master-wrapper-page']/div[@class='header-menu']/ul[@class='top-menu notmobile']/li[2]"));

    }

    @Test
    public void sortPriceLowToHigh() throws InterruptedException {

        moveToElement(By.linkText("Electronics"));

        mouseHoverToElementAndClick(By.linkText("Camera & photo"));

        selectByIndex(By.id("products-orderby"), 3);

        sleepMethod();

        javaScriptExecuter(0, 500);

    }

    @After
    public void closeBrowser() throws InterruptedException {
        sleepMethod();
        //quitMethod();

    }

}


