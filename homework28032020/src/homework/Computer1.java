package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Util1;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Computer1 extends Util1 {
    //private WebDriver driver;
    private String baseUrl = "https://demo.nopcommerce.com/";
    private JavascriptExecutor js;


    @Before


    public void openBrowser(){

        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","divers/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public void UserShouldNevigateToComputerPage() {
            clickOnElement(By.xpath("Computers"));
            //clikOnElement(ByLinkText("Computers"));
        // driver.findElement(By.linkText("Computers")).click();
        WebElement assertText = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String expected = "Computers";
        String actualTex = assertText.getText();
        Assert.assertEquals(actualTex, expected);
    }


    @Test

    public void addProducToShoppingCart() throws InterruptedException {

        //  driver.findElement(By.linkText("Computers")).click();
        WebElement computer = driver.findElement(By.linkText("Computers"));
        computer.click();

        WebElement desktop = driver.findElement(By.linkText("Desktops"));
        desktop.click();// click on desktop
        js.executeScript("window.scrollBy(0,-1800);");
        Thread.sleep(3000);

        WebElement buildYourOwnComputer = driver.findElement(By.linkText("Build your own computer"));
        buildYourOwnComputer.click();//Click on Product

        WebElement radioButton = driver.findElement(By.xpath("//input[@id='product_attribute_3_7']"));
        radioButton.click();//click on radio button
        sleep(3000);
        js.executeScript("window.scrollBy(0,-18000);");

        WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button-1']"));
        addToCart.click();//Click on add to cart

        WebElement assertTex = driver.findElement(By.xpath("//p[@class='content']"));

        String expectedText = "The product has been added to your shopping cart";
        String actualText = assertTex.getText();
        Assert.assertEquals(expectedText,actualText);

    }

    @After
    public void closeBrowser(){
        //  Thread.sleep(3000);
        driver.quit();
    }
}

