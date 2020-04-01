package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Util1;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Login1 extends Util1 {
    private WebDriver driver;
  //  private String baseURL01 = "https://demo.nopcommerce.com/";
   // private JavascriptExecutor js;

    @Before
    public void openBrowser(){

        String baseURL01 = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseURL01);
        }

    @Test
    public void registerMe() throws InterruptedException {
        //WebElement registerOnClick = driver.findElement(By.linkText("Register"));
        //registerOnClick.click();
        //Thread.sleep(2000);
        clickOnElement(By.xpath("//span[@class='male']"));

        //Click on radio button

        clickOnElement(By.xpath("//span[@class='male']"));
        WebElement radioBtnSelect;
        radioBtnSelect = driver.findElement(By.xpath("//span[@class='male']"));
        radioBtnSelect.click();

        WebElement firstName;
        firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Ravikumar");

        WebElement lastName;
        lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Makwana");

        WebElement dateOfBirth;
        dateOfBirth = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']//option[contains(text(),'11')]"));
        dateOfBirth.click();

        WebElement dayOfBirth;
        dayOfBirth = driver.findElement(By.xpath("//option[contains(text(),'June')]"));
        dayOfBirth.click();

        WebElement yearOfBirth;
        yearOfBirth = driver.findElement(By.xpath("//option[contains(text(),'1980')]"));
        yearOfBirth.click();

        WebElement emailField;
        Random email = new Random();
        char c = (char) (email.nextInt(26) + 'a');
        emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys(c + "ravee123@gmail.com");

        WebElement companyName;
        companyName = driver.findElement(By.id("Company"));
        companyName.sendKeys("rmak testing ltd");

        WebElement radioBtnNewsltr;
        radioBtnNewsltr = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        radioBtnNewsltr.click();

        WebElement passWordField;
        passWordField = driver.findElement(By.id("Password"));
        passWordField.sendKeys("abdd456");

        WebElement confirmPasswordField;
        confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("abdd456");


        WebElement registerBtn;
        registerBtn = driver.findElement(By.id("register-button"));
        registerBtn.click();

        WebElement welcomeText = driver.findElement(By.xpath("//input[@id='register-button']"));
        String expectedText = "Your registration completed";
        String actualText = welcomeText.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }
}

