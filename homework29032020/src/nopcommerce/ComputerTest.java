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
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;

public class ComputerTest extends Utilites1 {

     public String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openBrowser(){
        //String baseUrl = "https://demo.nopcommerce.com/";

        chromeDriver();
        maximizeWindow();
        implicitWaitSeconds(10);
        openUrl(baseUrl);
    }
        @Test
            public void UserShouldNevigateToComputerPage() {

            clickOnElement(By.linkText("Computers"));

            String expectedTex = "Computers";

            String actualTex = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));

            Assert.assertEquals(actualTex, expectedTex);
        }


        @Test

            public void addProductToShoppingCart() throws InterruptedException {

            clickOnElement(By.linkText("Computers"));

            clickOnElement(By.linkText("Desktops"));

            sleepMethod();

            clickOnElement(By.linkText("Build your own computer"));

            radioButtonClick(By.xpath("//input[@id='product_attribute_3_7']"));

            sleepMethod();

            clickOnElement(By.xpath("//input[@id='add-to-cart-button-1']"));

            String expectedText = "The product has been added to your shopping cart";
            String actualText = getTextFromElement(By.xpath("//p[@class='content']"));
            Assert.assertEquals(expectedText,actualText);

            }

        @After
            public void closeBrowser(){

            }
    }



